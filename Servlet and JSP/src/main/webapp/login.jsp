<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="style1.css">
</head>
<body>
    <div class="taskbar">
        <h2>ADMIN LOG IN PAGE</h2>
    </div>
    <div class="form">
        <form action=LoginServlet method="post">
            <label>User ID:</label><br>
            <input type="text" name="id" required>
            <br>
            <label>Password:</label><br>
            <input type="text" name="password" required>
            <br>
            <div class="form-buttons">
                <input type="submit" value="Login" name="signin" class="button">
                <input type="button" value="Sign Up" class="button" name="signup" id="signupButton">
            </div>
           </form>
    </div>
    <script>
        // JavaScript code to handle button click
        const signUpButton = document.getElementById('signupButton');
        signUpButton.addEventListener('click', function() {
            // Navigate to the desired page when the button is clicked
            window.location.href = 'signin.jsp'; // Change 'signup.html' to the actual page URL
        });
    </script>
</body>
</html>