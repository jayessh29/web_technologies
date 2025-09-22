//1. Create a Java servlet that: 
//o Displays the HTTP request headers. 
//o Sends an HTTP response with custom headers.


package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HeaderServlet")
public class HeaderServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        response.setContentType("text/html");

        // Add custom headers to the HTTP response
        response.setHeader("X-App-Name", "HeaderDemoApp");
        response.setHeader("X-Developer", "YourName");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>HTTP Request Headers</h2>");
        out.println("<table border='1' cellpadding='5'>");
        out.println("<tr><th>Header Name</th><th>Header Value</th></tr>");

        // Display all request headers
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            out.println("<tr><td>" + headerName + "</td><td>" + headerValue + "</td></tr>");
        }

        out.println("</table>");
        out.println("<h3>Custom Response Headers Sent:</h3>");
        out.println("<p>X-App-Name: HeaderDemoApp</p>");
        out.println("<p>X-Developer: YourName</p>");
        out.println("</body></html>");
    }
}
