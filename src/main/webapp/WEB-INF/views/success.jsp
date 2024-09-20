<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Enable JSP Expression Language--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Form Submit Success</title>
</head>
<body>

<h1>Form Submit Success</h1>

<h3>Your name is
    ${user.email}
</h3>
<h3>Your username is
    ${user.username}
</h3>
<h3>Password is:
    ${user.password}
</h3>

</body>
</html>
