package Day2_Static_Final;

public class Product {
    static double discount = 10.0;
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }
    private String productName;
    private double price;
    private int quantity;
    private final String productID;
    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        } else {
            System.out.println("Invalid product object.");
        }
    }
    public static void main(String[] args) {
        Product prod1 = new Product("Laptop", 1200.0, 1, "P101");
        Product prod2 = new Product("Headphones", 150.0, 2, "P102");
        prod1.displayProductDetails();
        System.out.println();
        prod2.displayProductDetails();
        System.out.println();
        Product.updateDiscount(15.0);
        System.out.println();
        prod1.displayProductDetails();
    }
}
