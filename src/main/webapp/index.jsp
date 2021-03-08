<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("message", "Hello, World!"); %>
<% request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7}); %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Adlister</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%--Fer's personal preference--%>
<jsp:include page="partials/navbar.jsp"></jsp:include>

<h1>${param.message}</h1>
<h1><%= request.getAttribute("message") %></h1>

<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>"name" parameter with EL: ${param.name}</p>
<p>"age" parameter with EL: ${param.age}</p>
<p>"method" attribute: <%= request.getMethod() %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>

<c:if test="${param.age >= 18}">
    <button>Enter</button>
</c:if>
<c:if test="${param.age < 18}">
    <% response.sendRedirect("http://www.neopets.com"); %>
</c:if>

<ul>
    <c:forEach items="${numbers}" var="n">
        <li><a href="#">Link ${n}</a></li>
    </c:forEach>
</ul>

<p>Search term: ${param.term}</p>

<script src="js/main.js"></script>
</body>
</html>