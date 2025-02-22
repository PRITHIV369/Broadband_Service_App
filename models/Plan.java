package models;

public class Plan {
    private String name;
    private String speed;
    private String dataLimit;
    private double price;
    private String duration;

    public Plan(String name, String speed, String dataLimit, double price, String duration) {
        this.name = name;
        this.speed = speed;
        this.dataLimit = dataLimit;
        this.price = price;
        this.duration = duration;
    }

    public String getName() { return name; }
    public String getSpeed() { return speed; }
    public String getDataLimit() { return dataLimit; }
    public double getPrice() { return price; }
    public String getDuration() { return duration; }
}
