package Day3_Array;
import java.util.*;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + ": ");
                int m = sc.nextInt();
                if (m < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter all subjects for this student.");
                    i--; 
                    break;
                } else {
                    marks[i][j] = m;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80) {
                grade[i] = 'A';
            } 
            else if (percentage[i] >= 70) {
                grade[i] = 'B';
            }
             else if (percentage[i] >= 60) {
                grade[i] = 'C';
            }
             else if (percentage[i] >= 50) {
                grade[i] = 'D';
            } 
            else if (percentage[i] >= 40) {
                grade[i] = 'E';
            }
             else if (percentage[i] <= 39) {
                grade[i] = 'G';
            }
             else {
                grade[i] = 'F';
            }
        }
        System.out.println("Student Report:");
        System.out.println(" Physics " + " Chemistry " + " Maths" + " Percentage " + " Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " " + marks[i][1] + " " + marks[i][2] + " " + percentage[i] + " " + grade[i]);
        }
        sc.close();
    }
}
