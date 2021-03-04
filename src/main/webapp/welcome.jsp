<%--
  Created by IntelliJ IDEA.
  User: csa116
  Date: 3/4/21
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My first java server page</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<%--link/include navbar to html--%>
<%@ include file="partials/navbar.jsp"%>

<h1>The current count is <%= counter %>.</h1>

<em><%= 1==1 %></em>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->
<script src="js/main.js"></script>
</body>
</html>