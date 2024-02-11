<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign-In</title>
    <link rel="stylesheet" href="style1.css">
</head>
<body>
    <div class="taskbar">
        <h2>NEW ADMIN SIGN IN PAGE</h2>
    </div>
    <div class="form">
        <form action=SigninServlet method="post">
            <label>User ID:</label><br>
            <input type="text" name="id" required>
            <br>
            <label>Password:</label><br>
            <input type="password" name="password" required>
            <br>
            <input type="submit" value="Sign in" name="signin" class="button">
           </form>
    </div>
</body>
</html>
