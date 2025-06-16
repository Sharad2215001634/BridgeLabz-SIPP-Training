package Day1_ProgrammingElements;
import java.util.*;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInches = sc.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInches = sc.nextDouble();

        double areaInSqInches = 0.5 * baseInches * heightInches;
        double areaInSqCm = areaInSqInches * 6.4516;
        double heightCm = heightInches * 2.54;
        int heightFeet = (int)(heightInches / 12);
        System.out.println(
            "Area of the triangle:\n" +
            "- In square inches: " +  areaInSqInches + "\n" +
            "- In square centimeters: " +  areaInSqCm + "\n\n" +
            "Your height is:\n" +
            "- In cm: " +  heightCm + "\n" +
            "- In feet: " + heightFeet + " ft ");
        sc.close();
    }
    
}
