package Day2_ControlFlow.Level_2;

import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int num = sc.nextInt();
        if (num > 0 && num < 100) {
            int multiple = num;

            System.out.println("Multiples of " + num + " below 100 are:");

            while (multiple < 100) {
                System.out.println(multiple);
                multiple += num;
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
