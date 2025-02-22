package controllers;
import models.Billing;
import models.User;

public class BillingController {
    public Billing generateBilling(User user) {
        if (user.getSubscription() == null) return new Billing(0);
        return new Billing(user.getSubscription().getPlan().getPrice());
    }
}
