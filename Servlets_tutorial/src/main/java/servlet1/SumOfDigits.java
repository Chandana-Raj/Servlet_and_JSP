package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SumOfDigits
 */
@SuppressWarnings("serial")
@WebServlet("/SumOfDigits")
public class SumOfDigits extends HttpServlet {
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
		      throws ServletException, IOException {
		      
		      
		      response.setContentType("text/html");

		      PrintWriter out = response.getWriter();
		     // String title = "Fibonacci Series";
		      String docType =
		         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		         
	 if(request.getParameter("number")!=null) {
		 int sum=0;
         int num=Integer.parseInt(request.getParameter("number"));
         if(request.getParameter("number").length()==2) {
         while(num!=0){
           int rem=num%10;
           num=num/10;
           sum=sum+rem;
          }
         out.println(docType +
		         "<html>\n" +
		            "<head><title>palindrome</title>\n<style>\r\n"
		            + "        table{\r\n"
		            + "            border:1px solid black;\r\n"
		            + "        }\r\n"
		            + "        th,td{\r\n"
		            + "            text-align: center;\r\n"
		            + "            color: black;\r\n"
		            + "            font-size: 16;\r\n"
		            + "            width: 30%;\r\n"
		            + "            border: 1px solid black;\r\n"
		            + "            border-collapse: collapse;\r\n"
		            + "        }\r\n"
		            + "    </style></head>\n" +
		            "<body bgcolor=\"#f0f0f0\">\r\n"
		            + "    <h1 align=\"center\">Sum of digits of a number</h1>>\r\n"
		            + "    <table align=\"center\">\r\n"
		            + "        <tr><th>Number:</th><td>"+request.getParameter("number")+"</td></tr>\r\n"
		            + "        <tr><th>Sum of digits:</th><td>"+sum+"</td></tr>\r\n"
		            + "    </table>\r\n"
		            + "</body> \n </html>");
         }
         else {
        	 out.println(docType +"\n"
        				+ "<html>\n\" +\n"
        				+ "<head><title>Sum of digits of a number</title>\n"
        				+ "</head>"
        				+ "<body>"
        				+ "<h1 align=\"center\">Sum of digits of a number</h1>"
        				+ "<p style=\"font-size:20; font-weight:bold;\" align=\"center\">Enter two digit number as value for \"number\".</p>"
        				+ "</body></html>");
		}
        
	  }
      else{
   	   
   	   out.println(docType +"\n"
   				+ "<html>\n\" +\n"
   				+ "<head><title>Sum</title>\n"
   				+ "</head>"
   				+ "<body>"
   				+ "<h1 align=\"center\">Sum of digits of a number</h1>"
   				+ "<p style=\"font-size:20; font-weight:bold;\" align=\"center\">Enter the number in query string containing value for name \"number\".</p>"
   				+ "</body></html>");

         }
 }

}
