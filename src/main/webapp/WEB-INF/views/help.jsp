<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %><%--
  Created by IntelliJ IDEA.
  User: HP
  Date: 9/18/2024
  Time: 10:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help Page</title>
</head>
<body>

<h1>Help Page</h1>
<%
    String name = (String) request.getAttribute("name");
    Integer roll = (Integer) request.getAttribute("roll");
    LocalDateTime time = (LocalDateTime) request.getAttribute("time");
%>

<h3>Your name is <%= name %>
</h3>
<h3>Your Roll is <%= roll %>
</h3>
<h3>Time is: <%= time.toString() %>
</h3>

</body>
</html>
