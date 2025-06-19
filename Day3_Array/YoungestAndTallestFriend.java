package Day3_Array;

import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Age of Amar :");
        int amarAge = sc.nextInt();
        System.out.print("Enter the height of Amar : ");
        int amarHeight = sc.nextInt();
        System.out.print("Enter the Age of Akbar :");
        int akbarAge = sc.nextInt();
        System.out.print("Enter the height of Akbar :");
        int akbarHeight = sc.nextInt();
        System.out.print("Enter the Age of Anthony :");
        int anthonyAge = sc.nextInt();
        System.out.print("Enter the height of Anthony :");
        int anthonyHeight = sc.nextInt();
        String youngest;
        if(amarAge < akbarAge && amarAge < anthonyAge ){
            youngest = "Amar";
        }
        else if(akbarAge < amarAge && akbarAge < anthonyAge){
            youngest = "Akbar";
        }
        else{
            youngest = "Anthony";
        }

        String tallest;
        if(amarHeight > akbarHeight && amarHeight > anthonyHeight)
        {
            tallest = "Amar";
        }
        else if(akbarHeight > amarHeight && akbarHeight > anthonyHeight){
            tallest = "Akbar";
        }
        else{
            tallest = "Anthony";
        }

        System.out.println("Yongest is : " + youngest);
        System.out.println("Tallest is : " + tallest);
        sc.close();
    }    
}

