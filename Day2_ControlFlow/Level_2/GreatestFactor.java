package Day2_ControlFlow.Level_2;
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int grtFact = 1;
        if (n > 1) {
            for (int i = n - 1; i >= 1; i--) {
                if (n % i == 0) {
                    grtFact = i;
                    break;
                }
            }
            System.out.println("Greatest factor (excluding itself): " + grtFact);
        } else {
            System.out.println("Please enter a n greater than 1.");
        }
        sc.close();
    }
}
