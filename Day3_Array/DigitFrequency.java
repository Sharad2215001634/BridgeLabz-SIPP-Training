package Day3_Array;

import java.util.*;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        int[] digits = new int[20]; 
        int index = 0;
        long temp = number;
        while (temp > 0) {
            digits[index] = (int)(temp % 10);
            temp = temp / 10;
            index++;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < index; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Digit Frequency in the number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }
        sc.close();
    }
}
