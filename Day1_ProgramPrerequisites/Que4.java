package Day1_ProgramPrerequisites;
import java.util.*;
public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        System.out.print("Enter the size of Radius : ");
        double radius = sc.nextDouble();
        double area = pi * radius * radius;
        System.out.println("Area of cirle is : "+area);
        sc.close();

        
    }
    
}
