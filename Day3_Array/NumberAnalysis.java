package Day3_Array;
import java.util.Scanner;
public class NumberAnalysis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []num = new int[5];
        System.out.println("Enter 5 numbers :");
        for(int i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println();
        for(int i = 0; i < num.length; i++){
            int n = num[i];
            if( n > 0 ){
                if(n % 2 == 0){
                    System.out.println(n+" is a Positive and Even");
                }
                else{
                    System.out.println(n+ " is a Positive and Odd");
                }
            }
            else if(n < 0){
                System.out.println(n+" is a Negative");
            }
            else{
                System.out.println(n +" is a zero");
            }
        }

        System.out.println();

        int first = num[0];
        int last = num[num.length -1];
        if(first > last){
            System.out.println("First is greater then Last");
        }
        else if(first == last){
            System.out.println("Both first and last is equal");
        }
        else{
            System.out.println("First is Smaller then last");
        }
        sc.close();
        
    }
}