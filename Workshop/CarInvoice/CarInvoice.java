package Workshop.CarInvoice;
import java.util.*;

public class CarInvoice {

    // ========== RideType Enum ==========
    enum RideType {
        NORMAL, PREMIUM
    }

    // ========== Ride Class ==========
    static class Ride {
        final RideType rideType;
        final double distance;
        final int time;

        public Ride(RideType rideType, double distance, int time) {
            this.rideType = rideType;
            this.distance = distance;
            this.time = time;
        }
    }

    // ========== InvoiceSummary Class ==========
    static class InvoiceSummary {
        final int numberOfRides;
        final double totalFare;
        final double averageFare;

        public InvoiceSummary(int numberOfRides, double totalFare) {
            this.numberOfRides = numberOfRides;
            this.totalFare = totalFare;
            this.averageFare = totalFare / numberOfRides;
        }

        @Override
        public String toString() {
            return "Total Rides: " + numberOfRides +
                   "\nTotal Fare: " + totalFare +
                   "\nAverage Fare per Ride: " + averageFare;
        }
    }

    // ========== InvoiceService Class ==========
    static class InvoiceService {
        private final Ride[] rides;

        public InvoiceService(Ride[] rides) {
            this.rides = rides;
        }

        public void printInvoiceSummary(String userId) {
            double totalFare = 0;
            for (Ride ride : rides) {
                totalFare += calculateFare(ride);
            }

            InvoiceSummary summary = new InvoiceSummary(rides.length, totalFare);
            System.out.println("\nUser ID: " + userId);
            System.out.println(summary);
        }

        private double calculateFare(Ride ride) {
            double costPerKm, costPerMinute, minFare;

            if (ride.rideType == RideType.PREMIUM) {
                costPerKm = 15;
                costPerMinute = 2;
                minFare = 20;
            } else {
                costPerKm = 10;
                costPerMinute = 1;
                minFare = 5;
            }

            double fare = (ride.distance * costPerKm) + (ride.time * costPerMinute);
            return Math.max(fare, minFare);
        }
    }

    // ========== Main Method ==========
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter User ID: ");
        String userId = sc.nextLine();

        System.out.print("Enter the Number of Rides: ");
        int rideCount = sc.nextInt();

        Ride[] rides = new Ride[rideCount];

        for (int i = 0; i < rideCount; i++) {
            System.out.println("\nEnter details for Ride " + (i + 1) + ":");
            System.out.print("Enter ride type (NORMAL or PREMIUM): ");
            String type = sc.next().toUpperCase();

            System.out.print("Enter Distance (in km): ");
            double distance = sc.nextDouble();

            System.out.print("Enter Time (in minutes): ");
            int time = sc.nextInt();

            RideType rideType = type.equals("PREMIUM") ? RideType.PREMIUM : RideType.NORMAL;
            rides[i] = new Ride(rideType, distance, time);
        }

        InvoiceService invoice = new InvoiceService(rides);
        invoice.printInvoiceSummary(userId);

        sc.close();
    }
}
