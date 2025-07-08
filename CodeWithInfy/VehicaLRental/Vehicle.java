public class Vehicle implements Rentable {
    protected String vehicleNumber;
    protected String brand;
    protected double dailyRate;

    public Vehicle(String vehicleNumber, String brand, double dailyRate) {
        this.vehicleNumber = vehicleNumber;
        this.brand = brand;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateRent(int days) {
        return dailyRate * days;
    }
}
