package servlet1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/square_number")
public class SquareNumber extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      //String title = "Square number";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
      if(request.getParameter("number")!=null) {
      int num=Integer.parseInt(request.getParameter("number"));
    	   if(Math.sqrt(num)-Math.floor(Math.sqrt(num))==0) {
    		   out.println(docType +
  			         "<html>\n" +
  			            "<head><title>Perfect square</title>\n<style>\r\n"
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
  			            + "    <h1 align=\"center\">Checkig if the number is Perfect Square</h1>>\r\n"
  			            + "    <table align=\"center\">\r\n"
  			            + "        <tr><th>Number:</th><td>"+num+"</td></tr>\r\n"
  			            + "        <tr><th>Result:</th><td>The number is a perfect square.</td></tr>\r\n"
  			            + "    </table>\r\n"
  			            + "</body> \n </html>");
       }
    	   else {
    		   out.println(docType +
    			         "<html>\n" +
    			            "<head><title>Perfect square</title>\n<style>\r\n"
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
    			            + "    <h1 align=\"center\">Checkig if the number is Perfect Square</h1>>\r\n"
    			            + "    <table align=\"center\">\r\n"
    			            + "        <tr><th>Number:</th><td>"+num+"</td></tr>\r\n"
    			            + "        <tr><th>Result:</th><td>The number is not a perfect square.</td></tr>\r\n"
    			            + "    </table>\r\n"
    			            + "</body> \n </html>");
		}
      }
   else{
	   
	   out.println(docType +"\n"
				+ "<html>\n\" +\n"
				+ "<head><title>perfect square</title>\n"
				+ "</head>"
				+ "<body>"
				+ "<h1 align=\"center\">Checking if number is perfect square.</h1>"
				+ "<p style=\"font-size:20; font-weight:bold;\" align=\"center\">Enter the query string containing value for name \"number\".</p>"
				+ "</body></html>");

      }
}
}