package Day5_Methods;
import java.util.*;
public class TriangleParkRun {
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000.0; 
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle in meters: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle in meters: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle in meters: ");
        double side3 = sc.nextDouble();
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            int rounds = calculateRounds(side1, side2, side3);
            System.out.println("The athlete must complete " + rounds + " round(s) to cover 5 km.");
        } else {
            System.out.println("The provided sides do not form a valid triangle.");
        }
        sc.close();
    }
}
