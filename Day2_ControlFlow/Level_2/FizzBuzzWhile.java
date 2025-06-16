package Day2_ControlFlow.Level_2;
import java.util.*;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter Positive Integer : " );
        int num = sc.nextInt();
        int i = 1;
        if(num >=1){
        while (i <= num) {
            if( i % 3 == 0 && i % 5 == 0){
                System.out.println("BuzzFizz");
            }
            else if(i % 3 == 0){
                System.out.println("Buzz");
            }
            else if(i % 5 == 0){
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
            i++;
        }
    }
    else{
        System.out.println("Please enter Positive Integer");
    }


        sc.close();
    }

    
}
