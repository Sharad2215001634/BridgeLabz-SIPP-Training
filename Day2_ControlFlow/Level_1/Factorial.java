package Day2_ControlFlow.Level_1;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        long fact = 1;
        int i = 1;
        if(num >= 0){
        while(i <= num){
            fact *=i;
            i++;
        }
        System.out.println("The factorial of " + num + " is: " + fact);
    }
    else{
        System.out.println("Please enter the Positive Number!");
    }
        sc.close();
    }
    
}
