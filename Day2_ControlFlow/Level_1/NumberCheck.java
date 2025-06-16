package Day2_ControlFlow.Level_1;
import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("Number is Positive");
        }
        else if(num < 0){
            System.out.println("Number is Negative");
        }
        else{
            System.out.println("Number is Zero");
        }
        sc.close();
    }
    
}
