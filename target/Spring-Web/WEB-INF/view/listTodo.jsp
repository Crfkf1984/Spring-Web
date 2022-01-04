<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LIST MY TODO</title>
</head>
<body>
<h2>List my TODO</h2>
<br>
<br>
<table>
    <tr>
        <th>title</th>
        <th>description</th>
        <th>priority</th>
        <th>data</th>
        <th>Operations</th>
    </tr>
    <c:forEach var="todolist" items="${TodoList}">
        <c:url var="updateButton" value="/update">
            <c:param name="todoId" value="${todolist.id}"/>
        </c:url>

        <c:url var="deleteButton" value="/delete">
            <c:param name="todoId" value="${todolist.id}"/>
        </c:url>

        <tr>
            <td>${todolist.title}</td>
            <td>${todolist.description}</td>
            <td>${todolist.urowen}</td>
            <td>${todolist.data}</td>
            <td><input type="button" value="UPDATE"  onclick="window.location.href='${updateButton}'"/>
               <input type="button" value="DELETE" onclick="window.location.href='${deleteButton}'"></td>

        </tr>
    </c:forEach>
</table>
<br>
<br>
<input type="button" value="CREATE TODO"
       onclick="window.location.href='todo'">
</body>
</html>
