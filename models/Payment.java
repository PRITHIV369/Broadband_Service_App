package models;

public class Payment {
    private String username;
    private double amount;

    public Payment(String username, double amount) {
        this.username = username;
        this.amount = amount;
    }

    public String getUsername() { return username; }
    public double getAmount() { return amount; }
}
