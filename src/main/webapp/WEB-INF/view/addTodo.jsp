<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей
  Date: 03.01.2022
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ADD MY TODO</title>
</head>
<body>
<h2>ADD TODO</h2>
<br>
<br>
<form:form action="saveTodoInBase" modelAttribute="newTodo">
    <form:hidden path="id"/>
    Title <form:input path="title"/>
    <form:errors path="title"/>
    <br>
    <br>
    Description <form:input path="description"/>
    <br>
    <br>
    Priority <form:select path="urowen">
    <form:option value="Higth" label="H"/>
    <form:option value="Middle" label="M"/>
    <form:option value="Low" label="L"/>
</form:select>
    <br>
    <br>
   Data  <input type="date" name="data"/>
    <br>
    <br>
    <input type="submit" value="OK"/>
</form:form>

</body>
</html>
