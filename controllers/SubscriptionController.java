package controllers;
import models.Subscription;
import models.Plan;

public class SubscriptionController {
    public Subscription createSubscription(Plan plan) { return new Subscription(plan); }
}
