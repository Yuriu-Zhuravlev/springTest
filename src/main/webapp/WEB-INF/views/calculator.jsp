<%--
  Created by IntelliJ IDEA.
  User: kono1
  Date: 22.03.2021
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Calculator page</title>
</head>
<body>
    <h2>Калькулятор</h2>
    <div>Поточний результат: ${count}</div>
    <div><a href="add">Додати</a></div>
    <div><a href="subtract">Відняти</a></div>
    <div><a href="multiply">Помножити</a></div>
    <div><a href="divide">Поділити</a></div>
</body>
</html>
