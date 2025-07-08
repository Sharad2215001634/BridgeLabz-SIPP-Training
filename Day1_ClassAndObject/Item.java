package Day1_ClassAndObject;
import java.util.*;
public class Item {
    public int itemCode;
    public String itemName;
    public double price;

    public Item(int itemCode,String itemName,double price){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public void display(){
        System.out.println("Code of Item is : " + itemCode);
        System.out.println("Name of Item is : " + itemName);
        System.out.println("Price of Item is : " + price);
    }

    public double totalCost(int quantity){
        return price * quantity;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item Code : ");
        int code = sc.nextInt();
        System.out.print("Enter Item Name : ");
        String name = sc.next();
        System.out.print("Enter Price : ");
        double price = sc.nextDouble();
        Item i = new Item(code,name,price);
        System.out.println("Item Details ");
        i.display();
        System.out.print("Enter Quantity to purchase : ");
        int quantit = sc.nextInt();
        System.out.println("Total Cost of  "   + quantit + " item(s)"  +" will be : " + i.totalCost(quantit) + " Rupees Only");
        sc.close();

    }
}
