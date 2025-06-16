package Day1_ProgramPrerequisites;
import java.util.Scanner;
public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter the Radius : ");
        double radius = sc.nextDouble();
        System.out.print("Enter the height : ");
        double height = sc.nextDouble();
        double volume  = pi * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume);
        sc.close();
        
    }
    
}
