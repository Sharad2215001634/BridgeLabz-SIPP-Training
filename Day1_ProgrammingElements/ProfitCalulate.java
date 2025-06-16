package Day1_ProgrammingElements;
import java.util.*;
public class ProfitCalulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        double costPrice = sc.nextDouble();
        System.out.print("Enter the Selling Price : ");
        double sellingPrice = sc.nextDouble();
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println(
            "Cost Price: " + costPrice + "\n" +
            "Selling Price: " + sellingPrice + "\n" +
            "Profit: " + profit + "\n" +
            "Profit Percentage: " +profitPercent + "%");
        sc.close();
    }
    
}
