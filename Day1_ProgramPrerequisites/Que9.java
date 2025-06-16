package Day1_ProgramPrerequisites;

import java.util.Scanner;
public class Que9 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = sc.nextDouble();

        double average = (num1 + num2 + num3) / 3;

        System.out.printf("The average of the three numbers is: " + average);

        sc.close();
    }
}
