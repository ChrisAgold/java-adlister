<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! int counter = 0; %>
<% counter += 1; %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My first java server page</title>
</head>
<body>
<%@include file="partials/navbar.jsp"%>
<%-- this is a JSP comment, you will *not* see this in the html --%>
<!-- this is an HTML comment, you *will* see this in the html -->
</body>
</html>