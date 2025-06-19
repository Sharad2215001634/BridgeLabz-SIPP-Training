package Day3_Array;
import java.util.Scanner;
public class Array2DTo1DConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        if (rows <= 0 || columns <= 0) {
            System.out.println("Please enter positive values for rows and columns.");
            sc.close();
            return;
        }
        int[][] matrix = new int[rows][columns];
        System.out.println("\nEnter elements for the " + rows + "x" + columns + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n2D Array (Matrix):");
        for (int i = 0; i < rows; i++) {
            System.out.print("[ ");
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j]);
                if (j < columns - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" ]");
        }
        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        System.out.println("\n1D Array (Copied from 2D Array):");
        System.out.print("[ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println("Summary:");
        System.out.println("Original 2D Array size: " + rows + " x " + columns);
        System.out.println("Converted 1D Array size: " + array.length);
        System.out.println("Total elements copied: " + index);   
        sc.close();
    }
}