package Workshop.RouteTrackerSystem;

class Driver {
    String driverId;
    String name;
    RouteLinkedList<Checkpoint> routeHistory;

    public Driver(String driverId, String name) {
        this.driverId = driverId;
        this.name = name;
        this.routeHistory = new RouteLinkedList<>();
    }

    public void showSummary() {
        System.out.println("Driver: " + driverId + " – " + name);
        System.out.println("Route Summary:");
        routeHistory.printRoute();
        double totalDist = routeHistory.computeTotalDistance();
        double totalPenalty = routeHistory.computeTotalPenalty();
        double score = totalDist - totalPenalty;

        System.out.println("Total Distance: " + totalDist + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + score);
        System.out.println("Critical Route Check: " +
                (routeHistory.isCriticalRouteComplete() ? "All required checkpoints present"
                                                        : "Missing critical checkpoint(s)"));
    }
}

