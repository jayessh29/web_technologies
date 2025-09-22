Write a servlet program and override all life cycle methods to log messages when each method is called.




import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/LifeCycleServlet")
public class LifeCycleServlet extends HttpServlet {

    // Constructor
    public LifeCycleServlet() {
        super();
        System.out.println("Constructor: Servlet object created");
    }

    // Called once when the servlet is first loaded
    @Override
    public void init() throws ServletException {
        System.out.println("init() method called - Servlet initialized");
    }

    // Called for each request (delegates to doGet/doPost)
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("service() method called - Request received");
        super.service(req, res); // call parent to forward to doGet/doPost
    }

    // Handles GET requests
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("doGet() method called - Handling GET request");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo</h2>");
        out.println("<p>Check the server console/logs to see lifecycle messages.</p>");
        out.println("</body></html>");
    }

    // Handles POST requests
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        System.out.println("doPost() method called - Handling POST request");

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><body>");
        out.println("<h2>Servlet Life Cycle Demo (POST)</h2>");
        out.println("<p>Check the server console/logs to see lifecycle messages.</p>");
        out.println("</body></html>");
    }

    // Called once when servlet is about to be destroyed
    @Override
    public void destroy() {
        System.out.println("destroy() method called - Servlet destroyed");
    }
}
