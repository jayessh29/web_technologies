 <!-- Create a navigation menu and use pseudo-classes to: o Change the color of links on hover. o Style form inputs when they are focused -->


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Pseudo-Classes Demo</title>
  <style>
    /* Navigation menu */
    nav {
      background-color: #333;
      padding: 10px;
      text-align: center;
    }

    nav a {
      color: white;
      text-decoration: none;
      margin: 0 15px;
      font-size: 18px;
      padding: 5px 10px;
      border-radius: 5px;
      transition: background-color 0.3s;
    }

    /* Hover effect on links */
    nav a:hover {
      background-color: #ff9800;
      color: black;
    }

    /* Form styling */
    form {
      margin-top: 40px;
    }

    input[type="text"], input[type="email"] {
      padding: 10px;
      width: 250px;
      border: 2px solid #ccc;
      border-radius: 5px;
      font-size: 16px;
      margin-bottom: 15px;
      display: block;
      margin-left: auto;
      margin-right: auto;
    }

    /* Focus effect on inputs */
    input:focus {
      border-color: #4CAF50;
      outline: none;
      background-color: #f0fff0;
    }

    input[type="submit"] {
      padding: 10px 20px;
      font-size: 16px;
      background-color: #333;
      color: white;
      border: none;
      border-radius: 5px;
      cursor: pointer;
    }

    input[type="submit"]:hover {
      background-color: #4CAF50;
    }
  </style>
</head>
<body>

  <!-- Navigation Menu -->
  <nav>
    <a href="#home">Home</a>
    <a href="#about">About</a>
    <a href="#services">Services</a>
    <a href="#contact">Contact</a>
  </nav>

  <!-- Form -->
  <form>
    <input type="text" placeholder="Enter your name">
    <input type="email" placeholder="Enter your email">
    <input type="submit" value="Submit">
  </form>

</body>
</html>
