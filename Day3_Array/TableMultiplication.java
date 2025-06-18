package Day3_Array;
import java.util.*;
public class TableMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number wants Multiplication : ");
        int []arr = new int[10];
        int num = sc.nextInt();
        for(int i = 0; i < arr.length ; i++){
             arr[i] = i+1;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(num +" * " + arr[i] + " = " + num*arr[i]);
        }
        sc.close();
    }
    
}
