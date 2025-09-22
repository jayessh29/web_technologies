 Write a servlet to fetch and display initialization parameters from web.xml using 
ServletConfig.




import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ConfigExample extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get ServletConfig object
        ServletConfig config = getServletConfig();

        // Fetch initialization parameters from web.xml
        String driver = config.getInitParameter("dbDriver");
        String url = config.getInitParameter("dbURL");
        String user = config.getInitParameter("dbUser");

        out.println("<html><body>");
        out.println("<h2>ServletConfig Example</h2>");
        out.println("<p><b>Database Driver:</b> " + driver + "</p>");
        out.println("<p><b>Database URL:</b> " + url + "</p>");
        out.println("<p><b>Database User:</b> " + user + "</p>");
        out.println("</body></html>");
    }
}







<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
version="3.1">

<servlet>
<servlet-name>ConfigExample</servlet-name>
<servlet-class>ConfigExample</servlet-class>

<!-- Initialization Parameters -->
<init-param>
   <param-name>dbDriver</param-name>
   <param-value>com.mysql.cj.jdbc.Driver</param-value>
</init-param>
<init-param>
   <param-name>dbURL</param-name>
   <param-value>jdbc:mysql://localhost:3306/testdb</param-value>
</init-param>
<init-param>
   <param-name>dbUser</param-name>
   <param-value>root</param-value>
</init-param>
</servlet>

<servlet-mapping>
<servlet-name>ConfigExample</servlet-name>
<url-pattern>/config</url-pattern>
</servlet-mapping>
</web-app>
