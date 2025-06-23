package EXTRAS_Built_in_Function;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input, formatter);
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = addedDate.minusWeeks(3);
        System.out.println("Original date      : " + date);
        System.out.println("After additions    : " + addedDate);
        System.out.println("After subtraction  : " + finalDate);

        sc.close();
    }
}
