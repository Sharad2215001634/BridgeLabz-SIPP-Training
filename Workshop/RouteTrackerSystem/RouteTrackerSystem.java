package Workshop.RouteTrackerSystem;

public class RouteTrackerSystem {
    public static void main(String[] args) {
        Driver driver = new Driver("D1204", "Kavita Nair");

        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 30, 60, 70));
        driver.routeHistory.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20, 10, 10));
        driver.routeHistory.addCheckpoint(new RestCheckpoint("C3", "Motel X", 40, 30, 35));
        driver.routeHistory.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30, 45, 60));

        driver.showSummary();
    }
}
