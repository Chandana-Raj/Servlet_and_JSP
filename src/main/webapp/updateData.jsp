<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="servlet_and_jsp.Record" %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Customer Details</title>
</head>
<body>
    <h2>Update Customer Details</h2>
    <form action="UpdateServlet" method="post">
        <!-- Include input fields for the details you want to update -->
        <input type="hidden" name="id" value="<%= record.getId() %>">
        <label>Name:</label><input type="text" name="name" value="<%= record.getName() %>" required><br>
        <label>Contact:</label><input type="text" name="contact" value="<%= record.getContact() %>" required><br>
        <!-- Add fields for other customer details -->

        <input type="submit" value="Update">
    </form>
</body>
</html>
