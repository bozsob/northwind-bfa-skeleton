package model;

/**
 * Created by trixi on 2017.05.23..
 */
public class Order {

    private int orderID;
    private int productID;
    private String productName;
    private double unitPrice;
    private int quantity;
    private double discount;
    private double total;

    public Order(int orderID,
                 int productID,
                 String productName,
                 double unitPrice,
                 int quantity,
                 double discount, double total) {
        this.orderID = orderID;
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.total = total;
    }

    public int getOrderID() {
        return orderID;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTotal() {
        return total;
    }
}
