package Day2_ControlFlow.Level_1;
import java.util.Scanner;
public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if( num >= 1)
        {
            sum = num * (num + 1) / 2;
            System.out.println("The sum of " + num + " natural numbers is " + sum);
        }
        else{
            System.out.println("The number " + num + " is not a natural number");
        }
        sc.close();
    }
    
}
