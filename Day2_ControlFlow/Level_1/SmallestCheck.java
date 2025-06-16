package Day2_ControlFlow.Level_1;
import java.util.*;
public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.print("Enter Third Number : ");
        int c = sc.nextInt();
        boolean isSmallest = a < b && a < c ;
        System.out.println("Is the first number the smallest? " + isSmallest);
        sc.close();
    }
    
}
