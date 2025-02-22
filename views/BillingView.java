package views;
import models.Billing;

public class BillingView {
    public void displayBill(Billing bill) {
        System.out.println("Billing Amount: ₹" + bill.getAmount());
    }
}
