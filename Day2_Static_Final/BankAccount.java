package Day2_Static_Final;
import java.util.*;
public class BankAccount {
    static String bankName = "Indian Bank";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber; 

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;       
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Invalid account object.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Holder Name : ");
        String AcHolderName = sc.nextLine();
        System.out.print("Enter the account number : ");
        int acNumber = sc.nextInt();

        BankAccount acc1 = new BankAccount(AcHolderName, acNumber);
        BankAccount acc2 = new BankAccount(AcHolderName,acNumber);

        acc1.displayAccountDetails();
        System.out.println();
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
        sc.close();
    }
}
