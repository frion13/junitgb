package seminar4.task3;

public class Order {
    private int orderId;
    private String product;
    private boolean isShipped;

    public Order(int orderId, String product) {
        this.orderId = orderId;
        this.product = product;
        this.isShipped = false;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public void ship() {
        isShipped = true;
    }
}
