package Day2_ControlFlow.Level_2;

import java.util.Scanner;

public class PowerWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number (positive integer): ");
        int number = sc.nextInt();
        System.out.print("Enter power (non-negative integer): ");
        int power = sc.nextInt();
        if (number >= 0 && power >= 0) {
            int result = 1;
            int counter = 0;
            while (counter != power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter valid non-negative integers.");
        }
        sc.close();
    }
}
