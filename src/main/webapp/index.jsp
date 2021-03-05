<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% request.setAttribute("message", "Hello, World!"); %>
<% request.setAttribute("numbers", new int[]{1, 2, 3, 4, 5, 6, 7}); %>
<%! int counter = 0; %>
<% counter += 1; %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My first java server page</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%--my personal prefrence--%>
<jsp:include page="partials/navbar.jsp"></jsp:include>

<h2>${param.message}</h2>
<h2><%= request.getAttribute("message") %></h2>

<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
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

Index for adlister
<script src="js/main.js"></script>
<%-- this is a JSP comment, you will *not* see this in the html --%>
<!-- this is an HTML comment, you *will* see this in the html -->
</body>
</html>