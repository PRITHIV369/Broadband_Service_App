import controllers.*;
import models.*;
import views.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserController userController = new UserController();
        PlanController planController = new PlanController();
        SubscriptionController subscriptionController = new SubscriptionController();
        BillingController billingController = new BillingController();
        PaymentController paymentController = new PaymentController();
        FeedbackController feedbackController = new FeedbackController();

        UserView userView = new UserView();
        PlanView planView = new PlanView();
        SubscriptionView subscriptionView = new SubscriptionView();
        BillingView billingView = new BillingView();
        PaymentView paymentView = new PaymentView();
        FeedbackView feedbackView = new FeedbackView();

        System.out.println("Welcome to Broadband Service");
        System.out.println("1. Register");
        System.out.println("2. Login");
        int choice = scanner.nextInt();
        scanner.nextLine();

        User user = null;
        if (choice == 1) {
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();
            System.out.print("Enter contact: ");
            String contact = scanner.nextLine();
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            if (userController.registerUser(username, password, contact, address)) {
                System.out.println("Registration successful!");
            } else {
                System.out.println("Username already exists.");
            }
        }

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        user = userController.authenticateUser(username, password);
        if (user == null) {
            System.out.println("Invalid credentials.");
            scanner.close();
            return;
        }

        System.out.println("Login successful!");
        userView.displayUser(user);

        System.out.println("\nChoose an option:");
        System.out.println("1. View Plans");
        System.out.println("2. Subscribe to a Plan");
        System.out.println("3. View Subscription");
        System.out.println("4. Pay Bill");
        System.out.println("5. Provide Feedback");
        int action = scanner.nextInt();
        scanner.nextLine();

        switch (action) {
            case 1:
                planView.displayPlans(planController.getPlans());
                break;

            case 2:
                planView.displayPlans(planController.getPlans());
                System.out.print("Enter plan name: ");
                String planName = scanner.nextLine();

                Plan selectedPlan = null;
                for (Plan plan : planController.getPlans()) {
                    if (plan.getName().equalsIgnoreCase(planName)) {
                        selectedPlan = plan;
                        break;
                    }
                }

                if (selectedPlan != null) {
                    Subscription newSubscription = subscriptionController.createSubscription(selectedPlan);
                    user.setSubscription(newSubscription);
                    System.out.println("Subscription successful!");
                } else {
                    System.out.println("Invalid plan name.");
                }
                break;

            case 3:
                subscriptionView.displaySubscription(user.getSubscription());
                break;

            case 4:
                Billing bill = billingController.generateBilling(user);
                billingView.displayBill(bill);
                System.out.println("Do you want to pay? (yes/no)");
                String payChoice = scanner.nextLine();

                if (payChoice.equalsIgnoreCase("yes")) {
                    paymentController.processPayment(user.getUsername(), bill.getAmount());
                    paymentView.displayPayment(new Payment(user.getUsername(), bill.getAmount()));
                }
                break;

            case 5:
                System.out.print("Enter feedback message: ");
                String message = scanner.nextLine();
                System.out.print("Enter rating (1-5): ");
                int rating = scanner.nextInt();
                scanner.nextLine();

                Feedback feedback = new Feedback(user.getUsername(), message, rating);
                feedbackController.addFeedback(feedback);
                feedbackView.displayFeedback(feedback);
                break;

            default:
                System.out.println("Invalid option.");
        }

        scanner.close();
    }
}
