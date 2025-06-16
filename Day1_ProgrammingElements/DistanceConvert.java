package Day1_ProgrammingElements;
import java.util.*;
public class DistanceConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.printf(kilometers+" kilometers is equal to " + miles + " miles");
        sc.close();
    }
}

    

