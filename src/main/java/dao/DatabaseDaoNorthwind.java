package dao;

import model.*;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by trixi on 2017.05.23..
 */
public class DatabaseDaoNorthwind implements DaoNorthwind {

    private final Connection conn;
    private String query;

    public DatabaseDaoNorthwind(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Order> getOrdersDetail() throws SQLException {

        List<Order> orders = new ArrayList<>();

        query = "SELECT o.OrderID, o.ProductID, p.ProductName, o.UnitPrice, o.Quantity,o.Discount " +
            "FROM OrderDetails AS o " +
            "JOIN Products AS p " +
            "ON o.ProductID = p.ProductID " +
            "ORDER BY OrderID;";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            orders.add(new Order(rs.getInt(1),
                rs.getInt(2),
                rs.getString(3),
                rs.getDouble(4),
                rs.getInt(5),
                rs.getDouble(6),
                rs.getDouble(7)));
        }
        return orders;
    }

    @Override
    public List<CustomersAndSuppliers> getCustomersAndSuppliers() throws SQLException {

        List<CustomersAndSuppliers> customersAndSuppliers = new ArrayList<>();

        query = "SELECT c.City, c.CompanyName, c.ContactName, 'Customer' AS Relationship " +
            "FROM Customers AS c " +
            "UNION " +
            "SELECT s.City, s.CompanyName, s.ContactName, 'Supplier' " +
            "FROM Suppliers AS s " +
            "ORDER BY City;";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            customersAndSuppliers.add(new CustomersAndSuppliers(
                rs.getString("City"),
                rs.getString("CompanyName"),
                rs.getString("ContactName"),
                rs.getString("Relationship")
            ));
        }

        return customersAndSuppliers;
    }

    @Override
    public List<Invoice> getDataToInvoice() throws SQLException {

        List<Invoice> dataForInvoice = new ArrayList<>();

        query = "SELECT * FROM northwind.task3;";

        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            Double total;
            if(rs.getDouble("Discount") == 0) {
                total = rs.getDouble("UnitPrice") *
                    rs.getInt("Quantity");
            }
            else {
                total = rs.getDouble("UnitPrice") *
                    rs.getInt("Quantity") *
                    rs.getDouble("Discount");
            }
            String salesperson = rs.getString("FirstName")
                + " "
                + rs.getString("LastName");

            dataForInvoice.add(new Invoice(
                rs.getString("ShipName"),
                rs.getString("ShipAddress"),
                rs.getString("ShipCity"),
                rs.getString("ShipRegion"),
                rs.getString("ShipPostalCode"),
                rs.getString("ShipCountry"),
                rs.getString("CustomerID"),
                rs.getString("CustomerName"),
                rs.getString("Address"),
                rs.getString("City"),
                rs.getString("Region"),
                rs.getString("PostalCode"),
                rs.getString("Country"),
                salesperson,
                rs.getString("OrderID"),
                rs.getString("OrderDate"),
                rs.getString("RequiredDate"),
                rs.getString("ShippedDate"),
                rs.getString("ShipperName"),
                rs.getString("ProductID"),
                rs.getString("ProductName"),
                rs.getDouble("UnitPrice"),
                rs.getDouble("Quantity"),
                rs.getDouble("Discount"),
                total,
                rs.getDouble("Freight")));
        }

        return dataForInvoice;
    }

    @Override
    public List<OrderTotalAmount> getTotalOrders() throws SQLException {

        List<OrderTotalAmount> orderTotals = new ArrayList<>();

        query = "SELECT " +
            "o.OrderID, " +
            "SUM(o.UnitPrice * o.Quantity) AS 'Total' " +
            "FROM " +
            "OrderDetails AS o " +
            "GROUP BY " +
            "OrderID " +
            "ORDER BY " +
            "OrderID;";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {

            orderTotals.add(new OrderTotalAmount(
                rs.getString(1),
                rs.getDouble(2)));
        }

        return orderTotals;
    }

    @Override
    public List<TotalIncome> getTotalIncome() throws SQLException {

        List<TotalIncome> totalIncome = new ArrayList<>();

        query = "SELECT * FROM northwind.task5;";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        while(rs.next()) {
            totalIncome.add(new TotalIncome(
                rs.getString(1),
                rs.getString(2),
                rs.getInt(3),
                rs.getDouble(4)
            ));
        }


        return totalIncome;
    }
}
