package dao;

import model.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by trixi on 2017.05.23..
 */
public interface DaoNorthwind {

    List<Order> getOrdersDetail() throws SQLException;
    List<CustomersAndSuppliers> getCustomersAndSuppliers() throws SQLException;
    List<Invoice> getDataToInvoice() throws SQLException;
    List<OrderTotalAmount> getTotalOrders() throws SQLException;
    List<TotalIncome> getTotalIncome() throws SQLException;


}
