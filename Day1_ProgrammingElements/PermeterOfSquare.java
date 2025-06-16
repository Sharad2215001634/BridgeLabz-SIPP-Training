package Day1_ProgrammingElements;
import java.util.*;
public class PermeterOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side : ");
        double a = sc.nextDouble();
        System.out.println("The length of the side is : "+ a +" Whose perimeter is : " + 4*a);
        sc.close();
    }
    
}
