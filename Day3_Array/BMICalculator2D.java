package Day3_Array;

import java.util.*;
public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int number = sc.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            double weight;
            do {
                System.out.print("Enter weight in kg (positive): ");
                weight = sc.nextDouble();
            } while (weight <= 0);
            double height;
            do {
                System.out.print("Enter height in meters (positive): ");
                height = sc.nextDouble();
            } while (height <= 0);
            personData[i][0] = height;
            personData[i][1] = weight;
            double bmi = weight / (height * height);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("BMI Report:");
        System.out.println("Height(m) " + " Weight(kg) " + " BMI " + " Status ");
        for (int i = 0; i < number; i++) {
            System.out.println(
                personData[i][0]+ " " + personData[i][1]+ " " + personData[i][2]+ " " + weightStatus[i]);
        }
        sc.close();
    }
}
