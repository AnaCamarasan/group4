package inventory.management;

public class Order {
    private final int orderId;
    private int productId;
    private int customerId;

    private static int nextOrderId = 0;

    public Order(int productId, int customerId) {
        this.orderId = nextOrderId++;
        this.productId = productId;
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", customerId=" + customerId +
                '}';
    }
}
