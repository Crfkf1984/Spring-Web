<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Hello my Frend</title>
</head>
<body>
<h2>Hello My Frend!!!!</h2>
<br>
<form:form action="Info" modelAttribute="Todo">
    Name :<form:input path="name"/>
    <br>
    <br>
    Urowen wajnosti : <form:input path="urowen"/>
<br>
<br>
    Description : <form:input path="descriptoin"/>
<br>
<br>
    <input type="submit" value="ENTER">
</form:form>
</body>
</html>
