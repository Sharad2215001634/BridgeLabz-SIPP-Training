package Day2_ControlFlow.Level_3;

import java.util.*;

public class LeapYearCheckOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year (>= 1582): ");
        int year = sc.nextInt();

        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println("Year is a Leap Year");
        } else if (year < 1582) {
            System.out.println("The program only works for year >= 1582.");
        } else {
            System.out.println("Year is not a Leap Year");
        }
        sc.close();
    }
}
