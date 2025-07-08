public class Customer {
    private String name;
    private Vehicle vehicle;

    public Customer(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void printInvoice(int days) {
        System.out.println("Customer Name: " + name);
        System.out.println("Vehicle Type: " + vehicle.getClass().getSimpleName());
        System.out.println("Brand: " + vehicle.brand);
        System.out.println("Vehicle Number: " + vehicle.vehicleNumber);
        System.out.println("Rent for " + days + " days: ₹" + vehicle.calculateRent(days));
        System.out.println("---------------------------------------");
    }
}
