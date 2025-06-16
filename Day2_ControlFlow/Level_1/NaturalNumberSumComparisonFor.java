package Day2_ControlFlow.Level_1;

import java.util.Scanner;

public class NaturalNumberSumComparisonFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int sum = 0;
            for(int i = 1; i <= n; i++){
                sum +=i;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + sum);

            if (formulaSum == sum) {
                System.out.println("Both computations are correct and match!");
            } else {
                System.out.println("There is a mismatch in the results!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }

        sc.close();
    }
}