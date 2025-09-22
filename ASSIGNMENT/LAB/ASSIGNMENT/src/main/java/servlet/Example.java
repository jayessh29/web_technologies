
Create a Java servlet program using both GenericServlet and HttpServlet and compare their implementation.




import java.io.*;
import javax.servlet.*;

public class GenericServletExample extends GenericServlet {
    @Override
    public void service(ServletRequest request, ServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Servlet Example using GenericServlet</h2>");
        out.println("<p>This servlet is protocol-independent.</p>");
        out.println("</body></html>");
    }
}


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpServletExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h2>Servlet Example using HttpServlet</h2>");
        out.println("<p>This servlet is specific to HTTP protocol.</p>");
        out.println("</body></html>");
    }
}
