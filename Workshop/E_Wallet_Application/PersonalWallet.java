package Workshop.E_Wallet_Application;

public class PersonalWallet extends Wallet {
    private final double DAILY_LIMIT = 50000;

    public PersonalWallet(User owner, boolean hasReferral) {
        super(owner, hasReferral);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        if (amount > getBalance() || amount > DAILY_LIMIT) {
            System.out.println("Transfer failed: limit or balance exceeded.");
            return false;
        }

        double tax = amount * 0.02;
        deduct(amount + tax, "Transferred to " + receiver.getName());
        receiver.getWallet().credit(amount, "Received from " + owner.getName());
        return true;
    }
}
