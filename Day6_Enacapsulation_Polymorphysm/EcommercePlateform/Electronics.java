package Day6_Enacapsulation_Polymorphysm.EcommercePlateform;

class Electronics extends Product implements Taxable {
    public Electronics(int productId, String name, double price) {
        super(productId, name, price);
    }

    public double calculateDiscount() {
        return getPrice() * 0.10; 
    }

    public double calculateTax() {
        return getPrice() * 0.18; 
    }

    public String getTaxDetails() {
        return "18% GST applied on Electronics.";
    }
}
