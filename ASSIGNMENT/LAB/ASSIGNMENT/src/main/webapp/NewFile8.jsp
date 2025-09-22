Implement a login system in JSP and servlet that uses cookies and session tracking to manage user authentication.


<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login Form</h2>
    
    <%-- Display error message if exists --%>
    <c:if test="${not empty errorMessage}">
        <p style="color:red">${errorMessage}</p>
    </c:if>

    <form action="LoginServlet" method="post">
        Username: <input type="text" name="username" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html>



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    
    // Dummy credentials (replace with DB in real apps)
    private final String USERNAME = "admin";
    private final String PASSWORD = "1234";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            // Valid login → create session
            HttpSession session = request.getSession();
            session.setAttribute("username", username);

            // Create cookie
            Cookie userCookie = new Cookie("username", username);
            userCookie.setMaxAge(60*30); // 30 minutes
            response.addCookie(userCookie);

            // Redirect to welcome page
            response.sendRedirect("welcome.jsp");
        } else {
            // Invalid login → show error on login.jsp
            request.setAttribute("errorMessage", "Invalid username or password!");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.forward(request, response);
        }
    }
}
