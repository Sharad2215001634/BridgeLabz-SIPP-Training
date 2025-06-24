package Day4_Strings;

import java.util.Scanner;

public class StringIndex {
    public static void generateStringIndexOutOfBounds(String input) {
        System.out.println("Character at index 10: " + input.charAt(10));
    }
    public static void handleStringIndexOutOfBounds(String input) {
        try {
            System.out.println("Character at index 10: " + input.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        handleStringIndexOutOfBounds(userInput);
        sc.close();
    }
}
