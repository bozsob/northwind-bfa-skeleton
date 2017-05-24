package servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import dao.DatabaseDaoNorthwind;
import util.ConnectionUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by trixi on 2017.05.24..
 */
@WebServlet("/totalIncome")
public class TotalIncomeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("application/json");
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            DatabaseDaoNorthwind dao = new DatabaseDaoNorthwind(ConnectionUtil
                .getConnection(ConnectionUtil.DatabaseName.NORTHWIND));

            objectMapper.writeValue(response.getOutputStream(), dao.getTotalIncome());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
