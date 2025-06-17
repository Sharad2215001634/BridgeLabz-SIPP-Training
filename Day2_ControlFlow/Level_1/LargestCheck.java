package Day2_ControlFlow.Level_1;
import java.util.Scanner;
public class LargestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number : ");
        int c = sc.nextInt();

        boolean isFirstLargest = a > b && a > c;
        boolean isSecondLargest = b > a && b > c;
        boolean isThirdLargest = c > a && c > a;
        
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        sc.close();
    }
    
}
