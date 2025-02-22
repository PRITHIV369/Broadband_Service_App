package models;

public class Feedback {
    private String username;
    private String message;
    private int rating;

    public Feedback(String username, String message, int rating) {
        this.username = username;
        this.message = message;
        this.rating = rating;
    }

    public String getUsername() { return username; }
    public String getMessage() { return message; }
    public int getRating() { return rating; }
}
