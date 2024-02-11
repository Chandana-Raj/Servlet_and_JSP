package servlet_and_jsp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 // Retrieve updated data from the form
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String contact = request.getParameter("contact");
        // Retrieve other updated fields as needed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "Chandu@3");
            
            // Use an SQL UPDATE query to update the customer's details
            String updateQuery = "UPDATE Customers SET name=?, contact=? WHERE id=?";
            PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, contact);
            preparedStatement.setInt(3, id);
            
            int rowsUpdated = preparedStatement.executeUpdate();
            
            if (rowsUpdated > 0) {
                // Successfully updated, you can redirect to a confirmation page
                response.sendRedirect("updateSuccess.jsp");
            } else {
                // Handle the case where the update failed
                response.sendRedirect("updateFailed.jsp");
            }

            preparedStatement.close();
            connection.close();
            
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("updateFailed.jsp");
        }
	}

}
