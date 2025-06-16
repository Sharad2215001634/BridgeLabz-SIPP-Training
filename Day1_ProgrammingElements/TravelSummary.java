package Day1_ProgrammingElements;

import java.util.*;

public class TravelSummary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter From City: ");
        String fromCity = sc.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = sc.nextLine();
        System.out.print("Enter To City: ");
        String toCity = sc.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in miles): ");
        double viaToFinalCity = sc.nextDouble();
        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        double timeViaToFinalCity = sc.nextDouble();
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;
        double totalTime = timeFromToVia + timeViaToFinalCity;
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " +
                           toCity + " via " + viaCity + " is " + totalDistanceKm +
                           " km and the Total Time taken is " +  totalTime + " minute(s).");

        sc.close();
    }
}
