package Day3_Array;

import java.util.Scanner;

public class FootballTeamMeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("Football Team Height Statistics");
        System.out.println("Total sum of heights: " + sum);
        System.out.println("Number of players: 11");
        System.out.printf("Mean height of the football team: " + mean);
        sc.close();
    }
}