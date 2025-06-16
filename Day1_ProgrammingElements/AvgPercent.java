package Day1_ProgrammingElements;

import java.util.Scanner;

public class AvgPercent {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter marks in Math : ");
            int math = sc.nextInt();
            System.out.print("Enter marks in Physics : ");
            int phy = sc.nextInt();
            System.out.print("Enter marks in Chemistry : ");
            int chem = sc.nextInt();
            int total = math + phy + chem;
            double avg = (double) total / 3;
            System.out.println("Sam’s average mark in PCM is  "  +avg + "%");
            sc.close();
        
    }
}
