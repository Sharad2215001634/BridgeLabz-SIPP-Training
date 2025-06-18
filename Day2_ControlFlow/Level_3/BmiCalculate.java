package Day2_ControlFlow.Level_3;
import java.util.*;
public class BmiCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height : ");
        double height = sc.nextDouble();
        System.out.print("Enter Weight : ");
        double weight = sc.nextDouble();
        double heMeters = height / 100;
        double bmi = weight / (heMeters * heMeters);
         if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi>=18.5  && bmi < 24.9) {
            System.out.println(" Normal weight");
        } else if (bmi >=25.0 && bmi < 39.9) {
            System.out.println(" Overweight");
        } else if(bmi >= 40.0) {
            System.out.println("Obese");
        }
        else{
            System.out.println("Enter Valid Input");
        }
        sc.close();
    }
}
