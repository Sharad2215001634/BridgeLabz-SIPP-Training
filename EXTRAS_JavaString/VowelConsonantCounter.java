package EXTRAS_JavaString;

import java.util.Scanner;
public class VowelConsonantCounter {
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Number of vowels     : " + vowels);
        System.out.println("Number of consonants : " + consonants);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countVowelsAndConsonants(input);

        sc.close();
    }
}
