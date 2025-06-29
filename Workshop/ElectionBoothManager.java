package Workshop;
import java.util.Scanner;
public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int candidate1 = 0, candidate2 = 0, candidate3 = 0;
        int age, vote;
        System.out.println("Welcome to the Election Booth");
        System.out.println("Enter -1 to stop voting");
        while (true) {
            System.out.println("Enter your age: ");
            age = sc.nextInt();
            if (age == -1) {
                System.out.println("Voting session ended");
                break;
            }
            if (age < 18) {
                System.out.println("You are not eligible to vote.");
                continue;
            }
            System.out.print("Enter your vote (1, 2, or 3): ");
            vote = sc.nextInt();
            if (vote == 1) {
                candidate1++;
            } else if (vote == 2) {
                candidate2++;
            } else if (vote == 3) {
                candidate3++;
            } else {
                System.out.println("Invalid vote! Please vote for 1, 2, or 3.");
            }
        }
        System.out.println(" Voting Results ");
        System.out.println("Candidate 1: " + candidate1 + " vote(s)");
        System.out.println("Candidate 2: " + candidate2 + " vote(s)");
        System.out.println("Candidate 3: " + candidate3 + " vote(s)");
        sc.close();
    }
}
