package views;
import models.Subscription;

public class SubscriptionView {
    public void displaySubscription(Subscription subscription) {
        if (subscription != null) {
            System.out.println("Current Plan: " + subscription.getPlan().getName());
            System.out.println("Status: " + (subscription.isActive() ? "Active" : "Inactive"));
        } else {
            System.out.println("No active subscription.");
        }
    }
}
