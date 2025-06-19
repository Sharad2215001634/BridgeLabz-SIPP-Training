package Day3_Array;
import java.util.Scanner;

public class OddEvenSeparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num <= 0) {
            System.out.println("Error: Please enter a natural number (positive integer).");
        }
        int[] oddNumbers = new int[num / 2 + 1];
        int[] evenNumbers = new int[num/ 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println("Odd Numbers Array:");
        System.out.print("[ ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println("Even Numbers Array:");
        System.out.print("[ ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i]);
            if (i < evenIndex - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println("Summary:");
        System.out.println("Total odd numbers: " + oddIndex);
        System.out.println("Total even numbers: " + evenIndex);
        sc.close();
    }
}