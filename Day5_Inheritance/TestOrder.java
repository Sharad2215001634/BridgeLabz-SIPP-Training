package Day5_Inheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        orderId = id;
        orderDate = date;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        trackingNumber = tracking;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Delivered on " + deliveryDate + ", Tracking: " + trackingNumber;
    }
}

public class TestOrder {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(1001, "2024-07-01", "TRK123", "2024-07-05");
        System.out.println(order.getOrderStatus());
    }
}
