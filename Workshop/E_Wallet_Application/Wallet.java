package Workshop.E_Wallet_Application;
import java.util.ArrayList;
import java.util.List;

public abstract class Wallet implements Transferable {
    private double balance;
    protected User owner;
    protected List<Transaction> history;

    public Wallet(User owner, boolean hasReferral) {
        this.owner = owner;
        this.history = new ArrayList<>();
        this.balance = hasReferral ? 50.0 : 0.0;
        if (hasReferral) {
            history.add(new Transaction("Referral Bonus", 50));
        }
    }

    public void loadMoney(double amount) {
        balance += amount;
        history.add(new Transaction("Loaded", amount));
    }

    public double getBalance() {
        return balance;
    }

    protected void deduct(double amount, String reason) {
        balance -= amount;
        history.add(new Transaction(reason, -amount));
    }

    protected void credit(double amount, String reason) {
        balance += amount;
        history.add(new Transaction(reason, amount));
    }

    public void printTransactionHistory() {
        System.out.println("Transaction history for " + owner.getName());
        for (Transaction t : history) {
            System.out.println(t);
        }
    }
    public abstract boolean transferTo(User receiver, double amount);
}
