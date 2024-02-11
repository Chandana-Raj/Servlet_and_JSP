package servlet_and_jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SqlConnection
 */
@WebServlet("/SqlConnection")
public class SqlConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SqlConnection() {
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// String employeeId = request.getParameter("employeeId");

	    }
   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out=response.getWriter();
		//response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel","root","Chandu@3");
			
			String name=request.getParameter("name");
			String contact=request.getParameter("contact");
			String address=request.getParameter("address");
			String email=request.getParameter("email");
			String check_in=request.getParameter("checkin");
			String check_out=request.getParameter("checkout");
			String numPeople=request.getParameter("numPeople");
			PreparedStatement ps=connection.prepareStatement("INSERT INTO Customers (name, contact, address, email, check_in_date, check_out_date, No_of_people) VALUES (?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, name);
			ps.setString(2, contact);
			ps.setString(3, address);
			ps.setString(4, email);
			ps.setString(5, check_in);
			ps.setString(6, check_out);
			ps.setString(7, numPeople);
		    
			 int rowsInserted = ps.executeUpdate();
			 
			 if (rowsInserted > 0) {
	                //  inserted successfully
	                response.sendRedirect("frontpage.jsp?success=true");
	            } else {
	                // Insertion failed
	                response.sendRedirect("frontpage.jsp?success=false");
	            }
	           
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}


