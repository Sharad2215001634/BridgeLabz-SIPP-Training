package Workshop.E_Wallet_Application;

public class BusinessWallet extends Wallet {
    private final double DAILY_LIMIT = 20000;

    public BusinessWallet(User owner, boolean hasReferral) {
        super(owner, hasReferral);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {
        if (amount > getBalance() || amount > DAILY_LIMIT) {
            System.out.println("Transfer failed: limit or balance exceeded.");
            return false;
        }

        double tax = amount * 0.01;
        deduct(amount + tax, "Business Transfer to " + receiver.getName());
        receiver.getWallet().credit(amount, "Business Received from " + owner.getName());
        return true;
    }
}
