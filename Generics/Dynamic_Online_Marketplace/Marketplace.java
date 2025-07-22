package Generics.Dynamic_Online_Marketplace;

import java.util.ArrayList;
import java.util.List;

public class Marketplace{
    public static void main(String[] args) {
        // Products
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 25.0, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 300.0, new GadgetCategory());

        // Catalog (mixed)
        List<Product<? extends Category>> catalog = new ArrayList<>();
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        System.out.println("=== Original Catalog ===");
        for (Product<? extends Category> p : catalog) {
            p.printInfo();
        }

        // Apply discounts
        DiscountManager.applyDiscount(book, 10);
        DiscountManager.applyDiscount(shirt, 20);
        DiscountManager.applyDiscount(phone, 15);

        System.out.println("\n=== Catalog After Discounts ===");
        for (Product<? extends Category> p : catalog) {
            p.printInfo();
        }
    }
}
