package Day2_ControlFlow.Level_2;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Integer :  ");
        int num = sc.nextInt();
        if(num >=1){
            System.out.println("Wowww! Your Entered Positive Integer and Your Number is : " + num );
            for(int i = 1; i <= num; i++)
            {
                if(i % 3 ==0 && i % 5 == 0){
                    System.out.println("FizzBuzz");
                }
                else if(i %3 == 0){
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0){
                    System.out.println("Buzz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Oooppsss!!!  Your Entered Negative Integer ,Please Try Again! With Positive Integer");
        }
        sc.close();
    }
    
}
