<!-- Create a webpage that includes: o A navigation menu with anchor tags. o A form with input fields, labels, and a submit button. o A table that displays user data. o Images with appropriate alt text. o Both ordered and unordered lists. -->



<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab Exercise - HTML Elements</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        nav {
            background-color: #333;
            padding: 10px;
        }
        nav a {
            color: white;
            text-decoration: none;
            margin: 0 15px;
        }
        nav a:hover {
            text-decoration: underline;
        }
        form {
            margin-top: 20px;
            background: #f4f4f4;
            padding: 15px;
            border-radius: 5px;
        }
        table {
            width: 60%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        table, th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }
        img {
            margin: 10px 0;
            width: 200px;
            height: auto;
        }
    </style>
</head>
<body>

    <!-- Navigation Menu -->
    <nav>
        <a href="#home">Home</a>
        <a href="#form">Form</a>
        <a href="#table">Table</a>
        <a href="#lists">Lists</a>
        <a href="#images">Images</a>
    </nav>

    <!-- Home Section -->
    <h1 id="home">Welcome to My Lab Exercise Page</h1>
    <p>This page demonstrates basic HTML elements.</p>

    <!-- Form Section -->
    <h2 id="form">User Registration Form</h2>
    <form>
        <label for="name">Full Name:</label><br>
        <input type="text" id="name" name="name" required><br><br>

        <label for="email">Email Address:</label><br>
        <input type="email" id="email" name="email" required><br><br>

        <label for="age">Age:</label><br>
        <input type="number" id="age" name="age" min="1"><br><br>

        <input type="submit" value="Submit">
    </form>

    <!-- Table Section -->
    <h2 id="table">User Data Table</h2>
    <table>
        <tr>
            <th>User ID</th>
            <th>Full Name</th>
            <th>Email</th>
        </tr>
        <tr>
            <td>1</td>
            <td>Alice Johnson</td>
            <td>alice@example.com</td>
        </tr>
        <tr>
            <td>2</td>
            <td>Bob Smith</td>
            <td>bob@example.com</td>
        </tr>
    </table>

    <!-- Images Section -->
    <h2 id="images">Sample Images</h2>
    <img src="https://via.placeholder.com/200" alt="Placeholder Image 1">
    <img src="https://via.placeholder.com/200/0000FF/FFFFFF" alt="Placeholder Image 2">

    <!-- Lists Section -->
    <h2 id="lists">Lists Example</h2>

    <h3>Ordered List (Steps)</h3>
    <ol>
        <li>Open the form</li>
        <li>Fill in your details</li>
        <li>Click submit</li>
    </ol>

    <h3>Unordered List (Features)</h3>
    <ul>
        <li>Navigation Menu</li>
        <li>Form</li>
        <li>Table</li>
        <li>Images</li>
        <li>Lists</li>
    </ul>

</body>
</html>
