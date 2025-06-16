package Day1_ProgrammingElements;
import java.util.Scanner;
public class HeightConvert {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in Centimeter : ");
        double cm = sc.nextDouble();
        double total_inch = cm/2.54;
        double feet = (int)(total_inch / 12);
        System.out.println(" Your height in cm is " + cm + " while in feet is " + feet + " and Inches is " + total_inch);
        sc.close();
    }
    
}
