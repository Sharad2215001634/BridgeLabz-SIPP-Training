package Workshop.E_Wallet_Application;

public interface Transferable {
    boolean transferTo(User receiver, double amount);
}