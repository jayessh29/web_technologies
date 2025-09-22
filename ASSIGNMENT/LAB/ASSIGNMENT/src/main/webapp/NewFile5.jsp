<!--. Write a simple Java servlet that accepts parameters from a user and displays a response..-->



<!DOCTYPE html>
<html>
<head>
    <title>Servlet Form Example</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="UserServlet" method="POST">
        Name: <input type="text" name="name"><br><br>
        Age: <input type="text" name="age"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Get form parameters
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        
        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Generate response
        out.println("<html><body>");
        out.println("<h2>Form Submission Result</h2>");
        out.println("<p><b>Name:</b> " + name + "</p>");
        out.println("<p><b>Age:</b> " + age + "</p>");
        out.println("</body></html>");
    }
}
