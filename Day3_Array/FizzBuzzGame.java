package Day3_Array;
import java.util.*;
public class FizzBuzzGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        String[] results = new String[number + 1];
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i != 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0 && i != 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0 && i != 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        System.out.println("FizzBuzz Results:");
        
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        System.out.println("\nSummary:");
        System.out.println("Range: 0 to " + number);
        System.out.println("Total positions: " + (number + 1));
        int fizzCount = 0, buzzCount = 0, fizzBuzzCount = 0;
        for (int i = 0; i <= number; i++) {
            if (results[i].equals("Fizz")) fizzCount++;
            else if (results[i].equals("Buzz")) buzzCount++;
            else if (results[i].equals("FizzBuzz")) fizzBuzzCount++;
        }
        System.out.println("Fizz count: " + fizzCount);
        System.out.println("Buzz count: " + buzzCount);
        System.out.println("FizzBuzz count: " + fizzBuzzCount);
        sc.close();
    }
}
