package Day3_Array;
import java.util.*;
public class EmployeeBonusCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--;
                continue;
            }
            System.out.print("Enter years of service: ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service! Enter again ! ");
                i--;
                continue;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonusAmount[i];
            totalBonus = totalBonus + bonusAmount[i];
            totalOldSalary = totalOldSalary + salary[i];
            totalNewSalary = totalNewSalary + newSalary[i];
        }
        System.out.println("Employee Details:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.println("Old Salary: " + salary[i]);
            System.out.println("Years of Service: " + yearsOfService[i]);
            System.out.println("Bonus Amount: " + bonusAmount[i]);
            System.out.println("New Salary: " + newSalary[i]);
            System.out.println();
        }
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}