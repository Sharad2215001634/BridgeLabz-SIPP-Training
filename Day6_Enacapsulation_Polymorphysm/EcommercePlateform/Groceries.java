package Day6_Enacapsulation_Polymorphysm.EcommercePlateform;


class Groceries extends Product {
    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.05; 
    }
}
