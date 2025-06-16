package Day1_ProgrammingElements;
import java.util.*;
public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.println(" The addition, subtraction, multiplication and division value of 2 numbers " + a + 
                " and " + b + " is " + (a+b) + " , " + (a-b) + " , " + (a *b) + " , " + (a /b)
                 );
        sc.close();
    }
    
}
