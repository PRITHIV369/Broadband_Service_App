package views;
import models.Payment;

public class PaymentView {
    public void displayPayment(Payment payment) {
        System.out.println("Payment Successful: " + payment.getUsername() + " paid ₹" + payment.getAmount());
    }
}
