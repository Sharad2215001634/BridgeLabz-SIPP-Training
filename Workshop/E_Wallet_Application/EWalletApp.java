package Workshop.E_Wallet_Application;
import java.util.*;

public class EWalletApp {
      private static Map<String, User> users = new HashMap<>();
    private static Scanner sc = new Scanner(System.in);

    private static void registerUser() {
        System.out.print("Enter user name: ");
        String name = sc.nextLine();
        System.out.println("Welcome : " + name);
        System.out.print("Referral? (yes/no): ");
        String referral = sc.nextLine().trim().toLowerCase();
        boolean hasReferral = referral.equals("yes");

        System.out.print("Choose wallet type (1 = Personal, 2 = Business): ");
        int type = sc.nextInt();
        sc.nextLine();

        User user = new User(name, hasReferral);
        if (type == 2) {
            user.setWallet(new BusinessWallet(user, hasReferral));
        }

        users.put(name.toLowerCase(), user);
        System.out.println("User '" + name + "' registered successfully.");
    }

    private static void loadMoney() {
        User user = getUser("Enter your name: ");
        if (user == null) return;

        System.out.print("Enter amount to load: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        user.loadMoney(amount);
        System.out.println("\nKhate me Paisa safalta Purawak daal diya gya hai !.");
    }

    private static void transferMoney() {
        User sender = getUser("Enter your name: ");
        if (sender == null) return;

        User receiver = getUser("Enter receiver's name: ");
        if (receiver == null) return;

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        boolean success = sender.getWallet().transferTo(receiver, amount);
        if (success) {
            System.out.println("Paisa Safaltapurwak Bhej Diya Gya hai .");
        }
    }

    private static void viewBalance() {
        User user = getUser("Enter your name: ");
        if (user != null) {
            System.out.println("Current Balance: " + user.getBalance());
        }
    }

    private static void viewHistory() {
        User user = getUser("Enter your name: ");
        if (user != null) {
            user.viewTransactionHistory();
        }
    }

    private static User getUser(String prompt) {
        System.out.print(prompt);
        String name = sc.nextLine().toLowerCase();
        if (!users.containsKey(name)) {
            System.out.println("User not found.");
            return null;
        }
        return users.get(name);
    }



    public static void main(String[] args) {

        System.out.println("----- Enter to Sharad's E Wallet Applicaton -----");
        while(true){
             System.out.println("\n1. Register User");
            System.out.println("2. Load Money");
            System.out.println("3. Transfer Money");
            System.out.println("4. View Balance");
            System.out.println("5. View Transaction History");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1 -> registerUser();
                case 2 -> loadMoney();
                case 3 -> transferMoney();
                case 4 -> viewBalance();
                case 5 -> viewHistory();
                case 6 -> {
                    System.out.println("Thankyou For Using Sharad's E wallet Application.");
                    System.out.println("Have A Good Day!.");
                    return;
                }
                default -> System.out.println("Invalid choice Please Enter A valid Choice");
            }

        }
    }


}
