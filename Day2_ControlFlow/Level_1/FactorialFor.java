package Day2_ControlFlow.Level_1;
import java.util.*;
public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        long fact = 1;
        if(n >= 0){
            for(int i = 1; i<=n; i++ ){
                fact *= i;
            }
            System.out.println("The factorial of " + n + " is: " + fact);
        }
        else{
            System.out.println("Please Enter the Positive Number!");
        }

        sc.close();
    }

    
}
