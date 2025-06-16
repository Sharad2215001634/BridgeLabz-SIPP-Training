package Day1_ProgrammingElements;

import java.util.Scanner;

public class DiscountFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the course fee in INR : ");
        double fee = sc.nextDouble();
        System.out.print("Enter the discount in Percenatge : ");
        double discountPercent = sc.nextDouble();
        double discount =  (fee * discountPercent) / 100;
        double discounted = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discounted);
        sc.close();
    }   
}
