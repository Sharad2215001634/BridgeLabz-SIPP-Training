package Day1_ProgramPrerequisites;
import java.util.Scanner;
public class Que10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.printf(kilometers+"kilometers is equal to" +  miles + "miles");
        sc.close();
    }
}
