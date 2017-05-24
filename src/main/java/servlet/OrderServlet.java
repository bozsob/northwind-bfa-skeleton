package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.DatabaseDaoNorthwind;
import model.Order;
import util.ConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("application/json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            DatabaseDaoNorthwind dao = new DatabaseDaoNorthwind(ConnectionUtil
                .getConnection(ConnectionUtil.DatabaseName.NORTHWIND));

            objectMapper.writeValue(response.getOutputStream(), dao.getOrdersDetail());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
