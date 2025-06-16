package Day1_ProgramPrerequisites;
import java.util.*;
public class Que7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter is : " + perimeter);
        sc.close();
    }
    
}
