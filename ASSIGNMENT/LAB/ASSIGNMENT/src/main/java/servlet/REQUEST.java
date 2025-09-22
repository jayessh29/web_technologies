Create a login form in JSP, send the data to a servlet, and use RequestDispatcher to forward or include a response based on input validity.





import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String uname = request.getParameter("username");
        String pass = request.getParameter("password");

        // Dummy validation (in real apps, check DB)
        if ("admin".equals(uname) && "1234".equals(pass)) {
            // Forward to welcome.jsp
            RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
            rd.forward(request, response);
        } else {
            // Include login.jsp again with error message
            PrintWriter out = response.getWriter();
            out.println("<p style='color:red'>Invalid username or password!</p>");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }
    }
}




<!DOCTYPE html>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <h2>Login Page</h2>
    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username"><br><br>
        Password: <input type="password" name="password"><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>
