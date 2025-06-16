package Day2_ControlFlow.Level_2;
import java.util.*;
public class FactorFinderWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Integer Number : ");
        int a = sc.nextInt();
        int i = 1;
        if(a > 0){
            System.out.println("Factors of " + a + " are:");
            while(i <= a){
                if(a % i == 0){
                    System.out.println(i);
                }
                i++;
            }
        }
        else{
            System.out.println("Please Enter A Positive Integer!");
        }
        sc.close();
    }
}
