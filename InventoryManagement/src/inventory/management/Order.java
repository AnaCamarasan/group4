package inventory.management;

public class Order {
    private final int orderId;
    private int productId;
    private int customerId;

    private int orderQuantity;

    private static int nextOrderId = 0;

    public Order(int productId, int customerId, int orderQuantity) {
        this.orderId = nextOrderId++;
        this.productId = productId;
        this.customerId = customerId;
        this.orderQuantity = orderQuantity;
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

    public int getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(int orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", customerId=" + customerId +
                ", orderQuantity=" + orderQuantity +
                '}';
    }
}
