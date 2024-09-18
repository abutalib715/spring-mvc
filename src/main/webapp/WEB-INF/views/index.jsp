<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/18/2024
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<h1>Home Page</h1>
<%
    String name = (String) request.getAttribute("name");
    Integer nid = (Integer) request.getAttribute("nid");
    List<String> friends = (List<String>) request.getAttribute("friends");
%>
<h3>Your name is <%= name %>
</h3>
<h3>Your NID is <%= nid %>
</h3>
<h3>Your Friends are: </h3>
<%
    for (String friend : friends) {
%>
<p><%= friend %></p>
<%
    }
%>

</body>
</html>
