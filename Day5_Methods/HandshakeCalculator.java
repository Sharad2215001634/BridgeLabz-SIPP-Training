package Day5_Methods;

import java.util.*;
public class HandshakeCalculator {
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        if (numberOfStudents < 2) {
            System.out.println("At least 2 students are required for a handshake.");
        } else {
            int handshakes = calculateHandshakes(numberOfStudents);
            System.out.println("The maximum number of possible handshakes is: " + handshakes);
        }

        sc.close();
    }
}

