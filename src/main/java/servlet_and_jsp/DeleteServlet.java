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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
		 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		        // Retrieve the customer's ID to be deleted
		        int id = Integer.parseInt(request.getParameter("id"));

		        try {
		            Class.forName("com.mysql.cj.jdbc.Driver");
		            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hotel", "root", "Chandu@3");
		            
		            // Use an SQL DELETE query to remove the customer's record
		            String deleteQuery = "DELETE FROM Customers WHERE id=?";
		            PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
		            preparedStatement.setInt(1, id);
		            
		            int rowsDeleted = preparedStatement.executeUpdate();
		            
		            if (rowsDeleted > 0) {
		                // Successfully deleted, you can redirect to a confirmation page
		                response.sendRedirect("deleteSuccess.jsp");
		            } else {
		                // Handle the case where the delete failed
		                response.sendRedirect("deleteFailed.jsp");
		            }

		            preparedStatement.close();
		            connection.close();
		            
		        } catch (ClassNotFoundException | SQLException e) {
		            e.printStackTrace();
		            response.sendRedirect("deleteFailed.jsp");
		        }
		    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
