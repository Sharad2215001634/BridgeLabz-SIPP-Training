package Day2_ControlFlow.Level_2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int grtFact = 1;

        if (num > 1) {
            int i = num - 1;
            while (i >= 1) {
                if (num % i == 0) {
                    grtFact = i;
                    break;
                }
                i--;
            }

            System.out.println("Greatest factor (excluding itself): " + grtFact);
        } else {
            System.out.println("Please enter a num greater than 1.");
        }

        sc.close();
    }
}

