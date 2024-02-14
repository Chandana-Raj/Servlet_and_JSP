package servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Palindrome extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String num;
		int rem,rev=0;
		PrintWriter out=response.getWriter();
		String docType ="<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		num=request.getParameter("number");
		if(num!=null) {
		int n=Integer.parseInt(num);
		while(n!=0) {
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		String revNum=String.valueOf(rev);
		if(revNum.equals(num)) {
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
			            + "    <h1 align=\"center\">Checking For Pallindrome</h1>>\r\n"
			            + "    <table align=\"center\">\r\n"
			            + "        <tr><th>Number:</th><td>"+num+"</td></tr>\r\n"
			            + "        <tr><th>Result:</th><td>The number is a pallindrome.</td></tr>\r\n"
			            + "    </table>\r\n"
			            + "</body> \n </html>");
		}
		else {
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
			            + "    <h1 align=\"center\">Checking For Pallindrome</h1>>\r\n"
			            + "    <table align=\"center\">\r\n"
			            + "        <tr><th>Number:</th><td>"+num+"</td></tr>\r\n"
			            + "        <tr><th>Result:</th><td>The number is not a pallindrome.</td></tr>\r\n"
			            + "    </table>\r\n"
			            + "</body> \n </html>");
		}
	}
		else {
			out.println(docType +"\n"
					+ "<html>\n\" +\n"
					+ "<head><title>palindrome</title>\n"
					+ "</head>"
					+ "<body>"
					+ "<h1 align=\"center\">Checking For Pallindrome.</h1>"
					+ "<p style=\"font-size:20; font-weight:bold;\" align=\"center\">Enter the query string containing value for name \"number\".</p>"
					+ "</body></html>");
		}
		
	}
}
