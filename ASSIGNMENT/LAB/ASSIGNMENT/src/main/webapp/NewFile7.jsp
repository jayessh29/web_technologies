
Lab Exercise: 
1. Create a JSP page that uses JSTL to iterate through a list, display scriplets, and access implicit 
objects.




<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSTL and JSP Demo</title>
</head>
<body>
    <h2>JSTL Iteration Example</h2>

    <%-- Scriplet: Create a list of strings --%>
    <%
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        // Store list in request scope
        request.setAttribute("fruitList", fruits);

        // Example using implicit object 'session'
        session.setAttribute("userName", "John Doe");
    %>

    <%-- JSTL: Iterate through the list --%>
    <ul>
        <c:forEach var="fruit" items="${requestScope.fruitList}">
            <li>${fruit}</li>
        </c:forEach>
    </ul>

    <h3>Accessing Implicit Objects</h3>
    <p><b>Session User Name:</b> ${sessionScope.userName}</p>
    <p><b>Context Path:</b> ${pageContext.request.contextPath}</p>
    <p><b>Request Method:</b> ${pageContext.request.method}</p>

    <%-- Example scriplet displaying number of fruits --%>
    <p>Total Fruits: <%= fruits.size() %></p>

</body>
</html>
