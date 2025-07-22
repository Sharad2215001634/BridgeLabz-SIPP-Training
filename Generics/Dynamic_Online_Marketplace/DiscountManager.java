package Generics.Dynamic_Online_Marketplace;

public class DiscountManager {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountAmount = product.getPrice() * percentage / 100.0;
        double newPrice = product.getPrice() - discountAmount;
        product.setPrice(newPrice);
        System.out.println("Applied " + percentage + "% discount to " + product.getName());
    }
}
