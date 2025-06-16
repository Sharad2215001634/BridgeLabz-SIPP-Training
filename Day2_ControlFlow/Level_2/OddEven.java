package Day2_ControlFlow.Level_2;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(num >= 1){
            for(int i = 1; i <=num; i++){
                if(i %2 == 0){
                    System.out.println(i+" is Even");
                }
                else{
                    System.out.println(i+" is Odd");
                }
            }
        }
        else{
            System.out.println("Enter the positive number  !");
        }
        sc.close();
    }
}
