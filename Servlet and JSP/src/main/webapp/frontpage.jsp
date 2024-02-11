<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customers' Details Entry Form</title>
<style>
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f0f0f0;
    }

    .taskbar {
        background-color: #333;
        color: white;
        padding: 10px;
        display: flex;
        align-items: center;
        justify-content: space-between;
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

    .container {
        position: absolute;
        top: 55%;
        left: 50%;
        transform: translate(-50%, -50%);
        padding: 20px;
        background: #6a6769;
        box-shadow: 0 25px 48px 0 rgba(0,0,0,0.2), 0 34px 80px 0 rgba(0,0,0,0.19);
        border-radius: 10px;
        font-weight: bold;
        width: 420px;
    }

    label {
        display: block;
        font-size: 16px;
        margin-bottom: 6px;
    }

    input[type="text"],
    input[type="date"] {
        width: 95%;
        padding: 10px;
        margin-bottom: 12px;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 16px;
    }

    input[type="submit"] {
        display: block;
        width: 100%;
        padding: 10px;
        background-color: #333;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 16px;
        cursor: pointer;
    }

    input[type="submit"]:hover {
        background-color: #555;
    }
</style>
</head>
<body>
    <div class="taskbar">
        <h2>Customers' Details Entry Form</h2>
        <a href=display class="button">View Table Data</a>
        <a href="login.jsp" class="button">Admin login page</a>
    </div>
    <div class="container">
        <form action="SqlConnection" method="post">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>
            
            <label for="contact">Contact:</label>
            <input type="text" id="contact" name="contact" required>
            
            <label for="address">Address:</label>
            <input type="text" id="address" name="address" required>
            
            <label for="email">Email:</label>
            <input type="text" id="email" name="email" required>
            
            <label for="checkin">Date of check-in:</label>
            <input type="date" id="checkin" name="checkin" required>
            
            <label for="checkout">Date of check-out:</label>
            <input type="date" id="checkout" name="checkout" required>
            
            <label for="numPeople">Number of occupants:</label>
            <input type="text" id="numPeople" name="numPeople" required>
            
            <input type="submit" value="Submit">
        </form>
    </div>
</body>
</html>
    