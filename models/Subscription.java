package models;

public class Subscription {
    private Plan plan;
    private boolean isActive;

    public Subscription(Plan plan) {
        this.plan = plan;
        this.isActive = true;
    }

    public Plan getPlan() { return plan; }
    public boolean isActive() { return isActive; }

    public void setPlan(Plan plan) { this.plan = plan; }
    public void setActive(boolean isActive) { this.isActive = isActive; }
}
