package Day1_ProgrammingElements;
import java.util.*;
public class PenDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of Pen : ");
        int totalPens = sc.nextInt();
        System.out.print("Enter the total number of Student : ");
        int totalStudents = sc.nextInt();

        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;

        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
        sc.close();
    }
}
