package Day4_Strings;
import java.util.Scanner;
public class SubstringComparison {
    public static String customSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        String customSub = customSubstring(input, start, end);
        String builtInSub = input.substring(start, end);

        boolean isEqual = compareStrings(customSub, builtInSub);
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Are both substrings equal? " + isEqual);
        sc.close();
    }
}
