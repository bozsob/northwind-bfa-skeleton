package model;

/**
 * Created by trixi on 2017.05.24..
 */
public class TotalIncome {

    private String productName;
    private String categoryName;
    private int shipYear;
    private double total;

    public TotalIncome(String productName,
                       String categoryName,
                       int shipYear,
                       double total) {
        this.productName = productName;
        this.categoryName = categoryName;
        this.shipYear = shipYear;
        this.total = total;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getShipYear() {
        return shipYear;
    }

    public double getTotal() {
        return total;
    }
}
