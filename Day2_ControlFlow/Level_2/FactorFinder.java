package Day2_ControlFlow.Level_2;
import java.util.*;
public class FactorFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Positive Integer : ");
        int n = sc.nextInt();
        if(n > 0){
            System.out.println("Factors of " + n + " are:");
            for(int i = 1; i <=n; i++){
                if(n % i == 0){
                    System.out.println(i);
                }
            }
        }
        else{
            System.out.println("Please Enter Positive Integer");
        }
        sc.close();
        
    }
    
}
