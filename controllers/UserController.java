package controllers;
import models.User;
import java.util.HashMap;

public class UserController {
    private HashMap<String, User> users = new HashMap<>();

    public boolean registerUser(String username, String password, String contact, String address) {
        if (users.containsKey(username)) return false;
        users.put(username, new User(username, password, contact, address));
        return true;
    }

    public User authenticateUser(String username, String password) {
        User user = users.get(username);
        return (user != null && user.getPassword().equals(password)) ? user : null;
    }
}
