package model;

/**
 * Created by trixi on 2017.05.24..
 */
public class OrderTotalAmount {

    private String orderID;
    private double total;

    public OrderTotalAmount(String orderID, double total) {
        this.orderID = orderID;
        this.total = total;
    }

    public String getOrderID() {
        return orderID;
    }

    public double getTotal() {
        return total;
    }
}
