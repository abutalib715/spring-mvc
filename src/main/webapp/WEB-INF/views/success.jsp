<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Enable JSP Expression Language--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>Form Submit Success</title>
</head>
<body>

<div class="container">
    <div class="text-center mt-5">
        <h3>${pageTitle}</h3>
        <p>${pageDesc}</p>
    </div>

    <h3>Your name is
        ${user.email}
    </h3>
    <h3>Your username is
        ${user.username}
    </h3>
    <h3>Password is:
        ${user.password}
    </h3>
</div>
</body>
</html>
