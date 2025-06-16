package Day2_ControlFlow.Level_1;
import java.util.*;
public class RocketLaunchFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CountDown start Number : ");
        int counter = sc.nextInt();
        for(int i = counter; i >=1; i--){
            System.out.println(i);
        }
        System.out.println("liftOff");
        sc.close();
    }
    
}
