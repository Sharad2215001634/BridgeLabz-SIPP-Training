package Day5_Inheritance;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("Savings Account - Interest: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int acc, double bal, double limit) {
        super(acc, bal);
        withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("Checking Account - Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int term;

    FixedDepositAccount(int acc, double bal, int term) {
        super(acc, bal);
        this.term = term;
    }

    void displayAccountType() {
        System.out.println("Fixed Deposit - Term: " + term + " months");
    }
}

public class TestBank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(12345, 10000, 4.5);
        CheckingAccount ca = new CheckingAccount(67890, 5000, 2000);
        sa.displayAccountType();
        ca.displayAccountType();
    }
}