package servlet_and_jsp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class display extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Record> records = new ArrayList<>();
        System.out.println("out");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "Chandu@3");
       
            String selectQuery = "SELECT * FROM Customers";
      
            PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);
            ResultSet resultSet = preparedStatement.executeQuery();
          
            while (resultSet.next()) {
                Record record = new Record();
                record.setId(resultSet.getInt("id"));//we are using the column names from the table created in database
                record.setName(resultSet.getString("name"));
                record.setContact(resultSet.getString("contact"));
                record.setAddress(resultSet.getString("address"));
                record.setEmail(resultSet.getString("email"));
                record.setCheck_in(resultSet.getString("check_in_date")); // Use "check_in_date" here
                record.setCheck_out(resultSet.getString("check_out_date")); // Use "check_out_date" here
                record.setNumPeople(resultSet.getString("No_of_people")); // Use "No_of_people" here
                records.add(record);
            }

            // Set the records attribute in the request
            //jsp ge send madakke
            request.setAttribute("records", records);

            // Forward the request to the viewRecords.jsp page
            //jsp ge send madtidivi
            request.getRequestDispatcher("displayData.jsp").forward(request, response);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("frontpage.jsp?error=" + e.getMessage());
        }
    }
}

