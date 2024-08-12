package processor;

import java.util.ArrayList;
import java.util.List;


public class PaymentProcessor extends Thread {

    private List<Transaction> transactions = new ArrayList<>();




    public synchronized void addTransaction(Transaction transaction) {
        transactions.add(transaction);
        notify();
    }

    @Override
    public void run() {
        while (true) {  
            processTransactions();
        }
    }

    private synchronized void processTransactions() {
        while (transactions.isEmpty()) {
            try {
                wait();  
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
                return;
            }
        }

        Transaction transaction = transactions.remove(0); 
        if (transaction != null) {
            System.out.println("Processing: " + transaction);
        }
    }
}