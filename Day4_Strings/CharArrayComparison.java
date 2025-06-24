package Day4_Strings;

import java.util.Scanner;

public class CharArrayComparison {
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
    public static void displayCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        char[] customChars = getChars(input);
        char[] builtInChars = input.toCharArray();
        boolean isEqual = compareCharArrays(customChars, builtInChars);
        System.out.print("\nCustom Char Array: ");
        displayCharArray(customChars);

        System.out.print("Built-in Char Array: ");
        displayCharArray(builtInChars);

        System.out.println("Are both character arrays equal? " + isEqual);
        sc.close();
    }
}

