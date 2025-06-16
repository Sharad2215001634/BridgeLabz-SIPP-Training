package Day1_ProgramPrerequisites;
import java.util.Scanner;
public class Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temp in Celcius : ");
        double celcius = sc.nextDouble();
        double farenheit = (celcius  * 9/5) + 32;
        System.out.println(farenheit + "F");
        sc.close();
    }
    
}
