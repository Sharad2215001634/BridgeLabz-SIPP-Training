package Day2_ControlFlow.Level_2;
import java.util.*;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary of Employee : ");
        double salary = sc.nextDouble();
        System.out.println("Enter Years of services : ");
        double years = sc.nextDouble();
        if(years >= 5){
            double bonus = 0.05 * salary;
            System.out.println("You are eligible for bonus : " +bonus);
        }
        else{
            System.out.println("You are not eligible for Bonus");
        }
        sc.close();
    }
}
