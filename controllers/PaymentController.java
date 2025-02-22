package controllers;
import models.Payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentController {
    private List<Payment> payments = new ArrayList<>();

    public void processPayment(String username, double amount) {
        payments.add(new Payment(username, amount));
    }
}
