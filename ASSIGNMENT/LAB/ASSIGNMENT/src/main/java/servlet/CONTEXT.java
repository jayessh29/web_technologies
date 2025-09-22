
Create multiple servlets that fetch shared data from web.xml using ServletContext.


SERVLET :-1


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletContext
        ServletContext context = getServletContext();

        // Fetch shared parameters
        String company = context.getInitParameter("companyName");
        String support = context.getInitParameter("supportEmail");

        out.println("<h2>FirstServlet</h2>");
        out.println("<p><b>Company:</b> " + company + "</p>");
        out.println("<p><b>Support Email:</b> " + support + "</p>");
        out.println("<a href='SecondServlet'>Go to SecondServlet</a>");
    }
}


SERVLET :-2


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletContext
        ServletContext context = getServletContext();

        // Fetch shared parameters
        String company = context.getInitParameter("companyName");
        String support = context.getInitParameter("supportEmail");

        out.println("<h2>SecondServlet</h2>");
        out.println("<p><b>Company:</b> " + company + "</p>");
        out.println("<p><b>Support Email:</b> " + support + "</p>");
    }
}
