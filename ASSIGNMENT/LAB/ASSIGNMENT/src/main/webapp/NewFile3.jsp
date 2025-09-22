<!--. Create a webpage where: 
o You apply an id to an element and style it uniquely. 
o Use class to apply the same style to multiple elements.-->


<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>ID vs Class Demo</title>
  <style>
    /* ID styling (unique to one element) */
    #special-heading {
      color: darkred;
      font-size: 28px;
      text-align: center;
      text-decoration: underline;
    }

    /* Class styling (shared by multiple elements) */
    .highlight-box {
      background-color: lightblue;
      border: 2px solid navy;
      padding: 15px;
      margin: 10px auto;
      width: 60%;
      font-family: Arial, sans-serif;
    }
  </style>
</head>
<body>

  <!-- Element styled with ID -->
  <h1 id="special-heading">This Heading is Styled with an ID</h1>

  <!-- Elements styled with the same Class -->
  <div class="highlight-box">
    This is the first box styled using a class.
  </div>

  <div class="highlight-box">
    This is the second box styled using the same class.
  </div>

  <p class="highlight-box">
    Even this paragraph is styled using the same class!
  </p>

</body>
</html>
