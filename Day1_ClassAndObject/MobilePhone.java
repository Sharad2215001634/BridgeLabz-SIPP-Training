package Day1_ClassAndObject;
import java.util.*;
public class MobilePhone {
    public String brand;
    public String model;
    public double price;
    public MobilePhone(String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void display(){
        System.out.println("Phone Brand is : " + brand);
        System.out.println("Phone Model is : " + model);
        System.out.println("Phone Price is : " + price);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Brand Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Model Name : ");
        String mod = sc.nextLine();
        System.out.print("Enter the Price  : ");
        double pri = sc.nextDouble();
        System.out.println();
        MobilePhone m = new MobilePhone(name, mod, pri);
        System.out.println("Mobile Phone Details");
        System.out.println();
        m.display();
        sc.close();
    }
}
