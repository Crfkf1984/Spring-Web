<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title></title>
</head>
<body>
<h2>Hello My Frend!!!!</h2>
<br>
<form:form action="Info" modelAttribute="Todo">
    Name :<form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Urowen wajnosti : <form:select path="urowen">
    <form:option value="Hight"/>
    <form:option value="middle"/>
    <form:option value="low"/>
</form:select>
    <form:errors path="urowen"/>
<br>
<br>
    Description : <form:input path="descriptoin"/>
    <form:errors path="descriptoin"/>
    <br>
    <br>
    Email : <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    <input type="submit" value="ENTER">
</form:form>
</body>
</html>
