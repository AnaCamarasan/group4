package inventory.management;

public class Order {
    private final int orderId;
    private int productId;
    private int customerId;

    private int quantity;
    private static int nextOrderId = 0;

    public Order(int productId, int customerId, int quantity) {
        this.orderId = nextOrderId++;
        this.productId = productId;
        this.customerId = customerId;
        this.quantity = quantity;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", quantity=" + quantity +
                '}';
    }
}
