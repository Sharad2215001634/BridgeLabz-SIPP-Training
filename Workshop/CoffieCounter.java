package Workshop;
import java.util.*;
public class CoffieCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String coffeType;
        int quantity;
        double price = 0,total,gst,finalAmount;
        System.out.println("Welcome to The Mehangi Coffee Shop");
        while(true){
            System.out.println("Enter Coffe Type (espresso/latte/cappuccino) or exit to stop : ");
            coffeType = sc.nextLine().toUpperCase();
            if(coffeType.equalsIgnoreCase("exit")){
                System.out.println("Thanks For Visiting");
                break;
            }
            switch (coffeType) {
                case "ESPRESSO":
                    price = 120;
                    break;
                    case "LATTE":
                    price = 160;
                    break;
                    case "CAPPUCCINO":
                    price = 200;
                    break;
                default:
                System.out.println("Please choose from these (espresso/latte/cappuccino) ");
                    continue;

            }
            System.out.print("Enter the Quantity : ");
            quantity = sc.nextInt();
            sc.nextLine();
            total = price * quantity;
            gst = total * 0.08;
            finalAmount = total + gst;
            System.out.println("Bill Summary:");
            System.out.println("Coffee Type : " + coffeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Price       : " + price);
            System.out.println("Total       : " + total);
            System.out.println("GST (5%)    : " + gst);
            System.out.println("Final Amount: " + finalAmount);
            System.out.println("------------------------------");
        }

        sc.close();

    }
    
}
