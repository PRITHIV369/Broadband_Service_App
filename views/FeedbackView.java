package views;
import models.Feedback;

public class FeedbackView {
    public void displayFeedback(Feedback feedback) {
        System.out.println("Feedback from " + feedback.getUsername() + ": " + feedback.getMessage() + 
                           " (Rating: " + feedback.getRating() + "/5)");
    }
}
