package controllers;
import models.Feedback;
import java.util.ArrayList;
import java.util.List;

public class FeedbackController {
    private List<Feedback> feedbackList = new ArrayList<>();

    public void addFeedback(Feedback feedback) { feedbackList.add(feedback); }
}
