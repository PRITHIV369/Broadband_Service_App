package views;
import java.util.List;
import models.Plan;

public class PlanView {
    public void displayPlans(List<Plan> plans) {
        System.out.println("Available Broadband Plans:");
        for (Plan plan : plans) {
            System.out.println(plan.getName() + " - " + plan.getSpeed() + ", " + plan.getDataLimit() + ", ₹" + plan.getPrice() + " (" + plan.getDuration() + ")");
        }
    }
}
