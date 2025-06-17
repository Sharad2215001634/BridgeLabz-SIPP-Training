package Day2_ControlFlow.Level_2;
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number (Positive Integer Only): ");
        int num = sc.nextInt();
        System.out.print("Enter the Power (Positive Integer Only) : ");
        int pow = sc.nextInt();
        int result = 1;
        if(num >0 && pow > 0){
            for(int i = 1; i<= pow; i++){
                result *= num;
            }
            System.out.println(num + " raised to the power " + pow + " is " + result);

        }
        sc.close();
    }
}
