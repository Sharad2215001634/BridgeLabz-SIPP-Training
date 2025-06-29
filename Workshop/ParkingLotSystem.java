package Workshop;

import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Capacity");
        int capacity = sc.nextInt();
        int occupied = 0; 
        int choice;
        boolean run = true;

        System.out.println("Welcome to the Smart Parking System");

        while (run) {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1. Park a Car");
            System.out.println("2. Exit a Car");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.println();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    if (occupied < capacity) {
                        occupied++;
                        System.out.println("Car parked successfully.");
                    } else {
                        System.out.println("Parking full! No space available.");
                    }
                    break;

                case 2:
                    if (occupied > 0) {
                        occupied--;
                        System.out.println("Car exited successfully.");
                    } else {
                        System.out.println("Parking is already empty.");
                    }
                    break;

                case 3:
                    System.out.println("Parking Occupancy: " + occupied + "/" + capacity);
                    break;

                case 4:
                    System.out.println("Exiting system. Thank you!");
                    run = false;
                    break;

                default:
                    System.out.println("Invalid option! Please choose from 1 to 4.");
            }

            if (occupied == capacity) {
                System.out.println("Warning: Parking Lot is FULL.");
            }
        }

        sc.close();
    }
}
