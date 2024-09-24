<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Enable JSP Expression Language--%>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>File Submit Success</title>
</head>
<body>

<div class="container">
    <div class="text-center mt-5">
        <h3>${msg}</h3>
        
        
        <img src="<c:url value="/resources/images/${filename}" />">
    </div>

</div>
</body>
</html>
