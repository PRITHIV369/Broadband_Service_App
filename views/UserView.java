package views;
import models.User;

public class UserView {
    public void displayUser(User user) {
        System.out.println("User: " + user.getUsername());
        System.out.println("Contact: " + user.getContact());
        System.out.println("Address: " + user.getAddress());
    }
}
