<!--. Write a simple CGI script using Java to accept user input from a form and display it on a webpage..-->


<!DOCTYPE html>
<html>
<head>
    <title>CGI Form Example</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="/cgi-bin/InputHandler.class" method="GET">
        Name: <input type="text" name="name"><br><br>
        Age: <input type="text" name="age"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
	