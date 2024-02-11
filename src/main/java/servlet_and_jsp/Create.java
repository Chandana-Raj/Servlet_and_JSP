package servlet_and_jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CreateDatabaseAndTable")
public class Create extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "Chandu@3");
            Statement statement = connection.createStatement();

            // SQL statement to create a new database
            String createDatabaseQuery = "CREATE DATABASE IF NOT EXISTS Hotel";
            statement.executeUpdate(createDatabaseQuery);

            // Close the initial connection
            connection.close();

            // Reconnect using the new database
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "Chandu@3");
            statement = connection.createStatement();
            
            // SQL statement to create a new table "Users"
            String createUsersTableQuery = "CREATE TABLE IF NOT EXISTS Users (" +
                                      "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                      "username VARCHAR(50),"+
                                      "password VARCHAR(50))";
            statement.executeUpdate(createUsersTableQuery);
            
            
            // SQL statement to create a new table "Customers"
            String createCustomersTableQuery = "CREATE TABLE IF NOT EXISTS Customers (" +
                                      "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                      "name VARCHAR(50),"+
                                      "contact VARCHAR(255), " +
                                      "address VARCHAR(255), " +
                                      "email VARCHAR(30), " +
                                      "check_in_date DATE, " +
                                      "check_out_date DATE, " +
                                      "No_of_people INT)";
            statement.executeUpdate(createCustomersTableQuery);
            
            out.println("<p>Database and tables created successfully</p>");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            out.println("<p>Error creating table: " + e.getMessage() + "</p>");
        }
    }
}
