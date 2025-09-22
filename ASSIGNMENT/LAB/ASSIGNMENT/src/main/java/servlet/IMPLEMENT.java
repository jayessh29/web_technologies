
. Implement a filter to perform server-side validation of user input.. Implement a filter to perform server-side validation of user input.





import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String username = request.getParameter("username");
        String email = request.getParameter("email");

        out.println("<html><body>");
        out.println("<h2>Servlet Received Data</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("</body></html>");
    }
}








<!DOCTYPE html>
<html>
<head>
    <title>Input Form</title>
</head>
<body>
    <h2>User Input Form</h2>
    <form action="ValidationServlet" method="post">
        Username: <input type="text" name="username"><br><br>
        Email: <input type="email" name="email"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
