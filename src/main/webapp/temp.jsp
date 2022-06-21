<%--
  Created by IntelliJ IDEA.
  User: Natalia
  Date: 16.06.2022
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <b>${pageContext.result}</b>
    <h1>${username}</h1>
    <h2>${userage}</h2>
    <c:forEach var="coockie" items="${coockies}">
        <p>value: ${coockie.name} : value ${coockie.value}</p>
    </c:forEach>
</head>
<body>

</body>
</html>
