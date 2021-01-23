<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Info</title>
</head>
<body>

<form:form action=" " modelAttribute="addEmployeeView">
    <br><br>
    Name <form:input path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Department <form:input path="department"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>

    <input type="submit" value="ok">

</form:form>
</body>
</html>
