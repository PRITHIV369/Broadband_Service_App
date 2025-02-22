package controllers;
import models.Plan;
import java.util.ArrayList;
import java.util.List;

public class PlanController {
    private List<Plan> plans = new ArrayList<>();

    public PlanController() {
        plans.add(new Plan("Basic", "50 Mbps", "100GB", 499, "1 Month"));
        plans.add(new Plan("Premium", "300 Mbps", "Unlimited", 1499, "1 Month"));
    }

    public List<Plan> getPlans() { return plans; }
}
