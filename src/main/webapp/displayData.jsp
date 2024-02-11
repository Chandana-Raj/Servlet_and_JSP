<%@ page import="java.util.List,java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="servlet_and_jsp.Record" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customers' Records</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        h1 {
            text-align: center;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: center;
            justify-content: space-between;'
        }
        th {
            background-color: #f2f2f2;
        }
         .button {
        display: inline-block;
        padding: 8px 16px;
        font-size: 16px;
        background-color: #6a6769;
        color: white;
        border: solid 1pt black;
        border-radius: 5px;
        cursor: pointer;
        text-decoration: none;
    }
        .taskbar {
            background-color: #333;
            color: white;
            display: flex;
            align-items: center;
            padding: 10px 20px;
            justify-content: space-between;
        }
        
    </style>
</head>
<body>
    <div class="taskbar">
        <h2>Student Records</h2>
        <a href="frontpage.jsp" class="button">Back to Form</a>
    </div>
    <table align="center">
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>CONTACT</th>
            <th>ADDRESS</th>
            <th>EMAIL ADDRESS</th>
            <th>DATE OF CHECK-IN</th>
            <th>DATE OF CHECK-OUT</th>
            <th>OCCUPANTS NUMBER</th>
            <th>EDIT</th>
        </tr>
        <%
        List<Record> recordsList = (List<Record>) request.getAttribute("records");
        if (recordsList != null) {
            for (int i = 0; i < recordsList.size(); i++) {
                Record record = recordsList.get(i);
        %>
        <tr>
            <td><%= record.getId() %></td>
            <td><%= record.getName() %></td>
            <td><%= record.getContact() %></td>
            <td><%= record.getAddress() %></td>
            <td><%= record.getEmail() %></td>
            <td><%= record.getCheck_in() %></td>
            <td><%= record.getCheck_out() %></td>
            <td><%= record.getNumPeople() %></td>
            <td>
                    <a href="updateData.jsp?id=<%=record.getId() %>>" class="button">Update</a>
                    <a href="DeleteServlet?id=<%=record.getId()%>>" class="button">Delete</a>
            </td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="9">No records available</td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>
