public class Main {
    public static void main(String[] args) {
        Vehicle bike = new Bike("BIKE101", "Hero");
        Customer customer1 = new Customer("Sharad", bike);
        customer1.printInvoice(3);

        Vehicle car = new Car("CAR202", "Hyundai");
        Customer customer2 = new Customer("Kumar", car);
        customer2.printInvoice(5);

        Vehicle truck = new Truck("TRK303", "Tata");
        Customer customer3 = new Customer("Singh", truck);
        customer3.printInvoice(2);
    }
}
