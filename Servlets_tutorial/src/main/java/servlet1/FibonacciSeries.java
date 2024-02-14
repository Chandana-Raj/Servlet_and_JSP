package servlet1;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet("/fibonacci_series")
public class FibonacciSeries extends HttpServlet {
 
   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
     // String title = "Fibonacci Series";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
         
      if(request.getParameter("number")!=null) {
          int num=Integer.parseInt(request.getParameter("number"));
          int t1=0;
          int t2=1;
          int t3;
          out.println(docType +
			         "<html>\n" +
			            "<head><title>Perfect square</title>\n<style>\r\n"
			            + "        div{\r\n"
			            + "            border:2px solid black;\r\n"
			            +"             align:center;\r\n"
			            + "        }\r\n"
			            +"          p{ text-align:center;}"
			            + "    </style></head>\n" +
			            "<body bgcolor=\"#f0f0f0\">\r\n"
			            + "    <h1 align=\"center\">Fibonacci series</h1>>\r\n"
			            +"<div>"
			            +"<p>"+t1+"</p>\n<p>"+t2+"</p>\n");
        	   while((num-2)!=0) {
        			   t3=t1+t2;
        	           t1=t2;
        	           t2=t3;
        	           out.println("<p>"+t3+"</p>\n");
        	           num--;
        		   }
        		   out.println("</div>"
      			            + "</body> \n </html>");
        	   }
   
       else{
    	   
    	   out.println(docType +"\n"
    				+ "<html>\n\" +\n"
    				+ "<head><title>Fibonacci series</title>\n"
    				+ "</head>"
    				+ "<body>"
    				+ "<h1 align=\"center\">Fibonacci series.</h1>"
    				+ "<p style=\"font-size:20; font-weight:bold;\" align=\"center\">Enter the number of terms in query string containing value for name \"number\".</p>"
    				+ "</body></html>");

          }
  }
}