<%--
  Created by IntelliJ IDEA.
  User: kono1
  Date: 22.03.2021
  Time: 19:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Додати:</title>
</head>
<body>
<form:form action="addPost" method="post">
    <div>Число: <form:input path="value"/></div>
    <div><input type="submit" value="Додати"/></div>
</form:form>
</body>
</html>
