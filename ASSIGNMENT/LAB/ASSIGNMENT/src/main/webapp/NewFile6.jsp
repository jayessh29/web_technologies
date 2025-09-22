

Create a registration form in JSP.


<!DOCTYPE html>
<html>
<head>
    <title>Registration Form</title>
</head>
<body>
    <h2>Registration Page</h2>
    <form action="RegistrationServlet" method="post">
        Name: <input type="text" name="name" required><br><br>
        Email: <input type="email" name="email" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        Age: <input type="number" name="age" required><br><br>
        <input type="submit" value="Register">
    </form>
</body>
</html>
