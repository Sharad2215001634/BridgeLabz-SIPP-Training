package Workshop.E_Wallet_Application;

public class User {
    private String name;
    private Wallet wallet;

    public User(String name, boolean hasReferral) {
        this.name = name;
        this.wallet = new PersonalWallet(this, hasReferral);
    }

    public String getName() {
        return name;
    }

    public void loadMoney(double amount) {
        wallet.loadMoney(amount);
    }

    public void viewTransactionHistory() {
        wallet.printTransactionHistory();
    }

    public double getBalance() {
        return wallet.getBalance();
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
}

