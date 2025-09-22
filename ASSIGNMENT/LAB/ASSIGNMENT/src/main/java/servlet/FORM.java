Send form data to a servlet, process it, and forward the response back to a JSP using RequestDispatcher.



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        // Fetch form data
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String age = request.getParameter("age");

        // Process data (for demo, we just pass it along)
        request.setAttribute("name", name);
        request.setAttribute("email", email);
        request.setAttribute("age", age);

        // Forward to JSP for displaying response
        RequestDispatcher rd = request.getRequestDispatcher("registrationSuccess.jsp");
        rd.forward(request, response);
    }
}
