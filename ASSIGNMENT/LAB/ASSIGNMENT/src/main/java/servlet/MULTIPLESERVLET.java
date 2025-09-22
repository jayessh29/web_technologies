
Use ServletContext to share data across multiple servlets.


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/SetContextServlet")
public class SetContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        context.setAttribute("company", "Tech Solutions Pvt Ltd");
        context.setAttribute("location", "Mumbai");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h3>ServletContext attributes set successfully!</h3>");
        out.println("<a href='GetContextServlet'>Go to GetContextServlet</a>");
    }
}
