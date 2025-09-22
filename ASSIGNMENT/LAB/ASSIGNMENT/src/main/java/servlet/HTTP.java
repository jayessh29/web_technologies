
Write a program using HttpServlet to handle HTTP-specific requests like GET and POST.


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/HttpRequestHandler")
public class HttpRequestHandler extends HttpServlet {
    
    // Handles GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>Handling GET Request</h2>");
        if (name != null) {
            out.println("<p>Hello, " + name + "! (from GET request)</p>");
        } else {
            out.println("<p>No name provided in GET request.</p>");
        }
        out.println("</body></html>");
    }

    // Handles POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>Handling POST Request</h2>");
        if (name != null) {
            out.println("<p>Hello, " + name + "! (from POST request)</p>");
        } else {
            out.println("<p>No name provided in POST request.</p>");
        }
        out.println("</body></html>");
    }
}
