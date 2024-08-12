package processor;

import java.time.LocalDateTime;

public class Transaction {
    private LocalDateTime date;
    private Double amount; 
    private String from;
    private String to;
    
    public LocalDateTime getDate() {
        return date;
    }

    public Double getAmount() {
        return amount;
    }

    public Transaction(LocalDateTime date, Double amount, String from, String to) {
        this.date = date;
        this.amount = amount;
        this.from = from;
        this.to = to;
    }
    public String getFrom() {
        return from;
    }
    public String getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Transaction [date=" + date + ", amount=" + amount + ", from=" + from + ", to=" + to + "]";
    }

    
}