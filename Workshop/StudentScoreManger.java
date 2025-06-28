package Workshop;
import java.util.*;

public class StudentScoreManger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Number of students must be greater than 0.");
            return;
        }
        double[] scores = new double[n];
        double sum = 0;
        System.out.println("Please Enter Positive Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Marks of Student " + (i + 1) + ": ");
            double mark = sc.nextDouble();
            if (mark < 0) {
                System.out.println("Marks must be positive. Try again.");
                i--;
                continue;
            }
            scores[i] = mark;
            sum += mark;
        }
        double avg = sum / n;
        double highest = scores[0];
        double lowest = scores[0];
        for (int i = 1; i < n; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        System.out.println("\nAverage Score: " + avg);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Highest Score: " + highest);

        System.out.println("\nScores above Average:");
        for (int i = 0; i < n; i++) {
            if (scores[i] > avg) {
                System.out.println(scores[i]);
            }
        }
        sc.close();
    }
}
