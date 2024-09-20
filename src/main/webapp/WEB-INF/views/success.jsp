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
    ${email}
</h3>
<h3>Your username is
    ${username}
</h3>
<h3>Password is:
    ${password}
</h3>

</body>
</html>
