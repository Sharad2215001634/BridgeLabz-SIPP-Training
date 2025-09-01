import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Order {
    private final String customer;
    private final double amount;

    public Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
    public String getCustomer() { return customer; }
    public double getAmount() { return amount; }
}

public class OrderRevanue {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("Alice", 120.5),
            new Order("Bob", 75.0),
            new Order("Alice", 200.0),
            new Order("Bob", 50.0),
            new Order("Charlie", 300.0)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream().collect(
                    Collectors.groupingBy(
                        Order::getCustomer,
                        Collectors.summingDouble(Order::getAmount)
                    )
                );

        revenueByCustomer.forEach((customer, total) ->
                System.out.println(customer + " → $" + total));
    }
}
