package models;

public class User {
    private String username;
    private String password;
    private String contact;
    private String address;
    private Subscription subscription;

    public User(String username, String password, String contact, String address) {
        this.username = username;
        this.password = password;
        this.contact = contact;
        this.address = address;
        this.subscription = null;
    }

    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getContact() { return contact; }
    public String getAddress() { return address; }
    public Subscription getSubscription() { return subscription; }

    public void setContact(String contact) { this.contact = contact; }
    public void setAddress(String address) { this.address = address; }
    public void setSubscription(Subscription subscription) { this.subscription = subscription; }
}
