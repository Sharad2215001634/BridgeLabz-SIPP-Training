package Day6_Enacapsulation_Polymorphysm.EcommercePlateform;


import java.util.ArrayList;

public class ECommercePlatform {
    public static void main(String[] args) {
        ArrayList<Product> cart = new ArrayList<>();

        Product laptop = new Electronics(1001, "Laptop", 60000);
        Product jeans = new Clothing(1002, "Jeans", 2000);
        Product rice = new Groceries(1003, "Basmati Rice", 1200);

        cart.add(laptop);
        cart.add(jeans);
        cart.add(rice);

        System.out.println("------ Cart Summary ------\n");
        for (Product p : cart) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable) p).calculateTax() : 0.0;
            double finalPrice = p.getPrice() + tax - discount;

            if (p instanceof Taxable) {
                System.out.println(((Taxable) p).getTaxDetails());
            } else {
                System.out.println("No tax applicable.");
            }

            System.out.printf("Discount   : %.2f\n", discount);
            System.out.printf("Tax        : %.2f\n", tax);
            System.out.printf("Final Price: %.2f\n", finalPrice);
            System.out.println("--------------------------\n");
        }
    }
}
