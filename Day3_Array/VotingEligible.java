package Day3_Array;
import java.util.*;
public class VotingEligible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter All 10 student age :  ");
        int [] age = new int[10];
        for(int i = 0; i < age.length; i++){
            age[i] = sc.nextInt();
        }
        for(int i = 0; i < age.length; i++){
            int ages = age[i];
            if(ages <= 0){
                System.out.println("please Enter a valid age");
            }
            else if(ages >= 18){
                System.out.println("Your age is : " + ages + " And Your Are eligible" );
            }
            else{
                System.out.println("Your age is : " +ages +" and you are Not eligible");
            }
        }
        sc.close();
    }
    
}
