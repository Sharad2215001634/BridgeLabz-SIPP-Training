package Day1_ProgramPrerequisites;
import java.util.*;
public class Que6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount : ");
        double principle = sc.nextDouble();
        System.out.print("Enter the Rate : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the Time : ");
        double time = sc.nextDouble();
        double simple_intrest = (principle * rate * time) / 100;
        System.out.println("Simple Intrest will be : "+simple_intrest);
        sc.close();


    }
    
}
