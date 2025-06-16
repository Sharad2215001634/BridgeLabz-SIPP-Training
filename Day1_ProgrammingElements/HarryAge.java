package Day1_ProgrammingElements;
import java.util.*;
public class HarryAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Current Year : ");
        int curr_year = sc.nextInt();
        System.out.print("Enter BirthYear : ");
        int birth_year = sc.nextInt();
        int age = curr_year - birth_year;
        System.out.println("Harry's age in 2024 is :  " + age);
        sc.close();

        
    }
    
}
