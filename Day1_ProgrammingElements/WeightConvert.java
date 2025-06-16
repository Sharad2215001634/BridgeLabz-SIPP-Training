package Day1_ProgrammingElements;
import java.util.*;
public class WeightConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Weight in Pounds : ");
        double weight = sc.nextDouble();
        double kiloweight = weight * 2.2;
        System.out.println(" The weight of the person in pounds is : " + weight + " and in kg is : " + kiloweight);
        sc.close();
    }
    
}
