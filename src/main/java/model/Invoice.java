package model;

/**
 * Created by trixi on 2017.05.23..
 */
public class Invoice {

    private String shipName; //Orders
    private String shipAddress; //Orders
    private String shipCity; //Orders
    private String shipRegion; //Orders
    private String shipPostalCode; //Orders
    private String shipCountry; //Orders
    private String customerID; //Orders, Customers
    private String customerName; // Customers CompanyName - the name of the customer's company
    private String address; // Customers
    private String city; // Customers
    private String region; // Customers
    private String postalCode; // Customers
    private String country; // Customers
    private String salesperson; // Employees FisrtName + LastName - the fullname of the employee separated by space
    private String orderID; //Orders, OrderDetails
    private String orderDate; // Orders
    private String requiredDate; // Orders
    private String shippedDate; // Orders
    private String shipperName; // Shippers CompanyName - Orders ShipVia == Shippers ShipperID
    private String productID; // Products
    private String productName; // Products
    private double unitPrice; // Products, OrderDetails
    private double quantity; // OrderDeatils
    private double discount; // OrderDeatils
    private double total; // see previous query (more detailed orders)
    private double freight; // Orders

    public Invoice(String shipName,
                   String shipAddress,
                   String shipCity,
                   String shipRegion,
                   String shipPostalCode,
                   String shipCountry,
                   String customerID,
                   String customerName,
                   String address,
                   String city,
                   String region,
                   String postalCode,
                   String country,
                   String salesperson,
                   String orderID,
                   String orderDate,
                   String requiredDate,
                   String shippedDate,
                   String shipperName,
                   String productID,
                   String productName,
                   double unitPrice,
                   double quantity,
                   double discount,
                   double total,
                   double freight) {
        this.shipName = shipName;
        this.shipAddress = shipAddress;
        this.shipCity = shipCity;
        this.shipRegion = shipRegion;
        this.shipPostalCode = shipPostalCode;
        this.shipCountry = shipCountry;
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.salesperson = salesperson;
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.shipperName = shipperName;
        this.productID = productID;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discount = discount;
        this.total = total;
        this.freight = freight;
    }

    public double getTotal() {
        return total;
    }

    public String getSalesperson() {
        return salesperson;
    }

    public String getShipName() {
        return shipName;
    }

    public String getShipAddress() {
        return shipAddress;
    }

    public String getShipCity() {
        return shipCity;
    }

    public String getShipRegion() {
        return shipRegion;
    }

    public String getShipPostalCode() {
        return shipPostalCode;
    }

    public String getShipCountry() {
        return shipCountry;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getOrderID() {
        return orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public String getRequiredDate() {
        return requiredDate;
    }

    public String getShippedDate() {
        return shippedDate;
    }

    public String getShipperName() {
        return shipperName;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFreight() {
        return freight;
    }
}
