

Create a web application listener that logs application start and stop events.



import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/GetContextServlet")
public class GetContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        ServletContext context = getServletContext();
        String company = (String) context.getAttribute("company");
        String location = (String) context.getAttribute("location");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h2>Shared Data from ServletContext</h2>");
        out.println("<p><b>Company:</b> " + company + "</p>");
        out.println("<p><b>Location:</b> " + location + "</p>");
    }
}
