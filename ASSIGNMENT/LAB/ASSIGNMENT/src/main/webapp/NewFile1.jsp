 <!Create a webpage and use CSS to demonstrate: o Margin applied to an element. o Padding applied to a div. o The effect of different margin and padding values on the layout.>		


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Margin and Padding Demo</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f9f9f9;
      text-align: center;
    }

    /* Demonstrating Margin */
    .margin-box {
      background-color: #87ceeb;
      color: white;
      width: 200px;
      margin: 40px auto; /* margin around the box */
      padding: 10px;
    }

    /* Demonstrating Padding */
    .padding-box {
      background-color: #ffa07a;
      color: white;
      width: 200px;
      margin: 20px auto;
      padding: 40px; /* space inside the box */
    }

    /* Different margin & padding values */
    .mixed-box {
      background-color: #90ee90;
      color: #333;
      width: 200px;
      margin: 60px auto 10px auto; /* top, right, bottom, left */
      padding: 5px 20px 40px 10px; /* top, right, bottom, left */
    }
  </style>
</head>
<body>

  <h1>Margin vs. Padding Demo</h1>

  <div class="margin-box">
    This box has <b>40px margin</b>.
  </div>

  <div class="padding-box">
    This box has <b>40px padding</b>.
  </div>

  <div class="mixed-box">
    This box has <b>different margin & padding values</b>.
  </div>

</body>
</html>
