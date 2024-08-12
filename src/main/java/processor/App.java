package processor;

import java.time.LocalDateTime;

public class App 
{
    public static void main( String[] args ){



    PaymentProcessor paymentprocessor = new PaymentProcessor();

    paymentprocessor.start();
    paymentprocessor.addTransaction(new Transaction(LocalDateTime.now(), 1000.0, "Roma", "Sasha"));
    paymentprocessor.addTransaction(new Transaction(LocalDateTime.now(), 10.0, "Sasha", "Oleh"));
    paymentprocessor.addTransaction(new Transaction(LocalDateTime.now(), 1087.5, "Andrian", "Bogdan"));
    paymentprocessor.addTransaction(new Transaction(LocalDateTime.now(), 19.0, "Oleh", "Andrian"));


    



    }
}