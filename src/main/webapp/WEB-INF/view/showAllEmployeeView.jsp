
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
 
<!DOCTYPE html>
<html>



<body>
<h1> All Employees </h1>
<br/><br/>
<%--создаем таблицу для отобраения всех работников--%>
<table >
<%--    создадим заголовки--%>
    <tr>
        <th>name</th>
        <th>surname</th>
        <th>department</th>
        <th>salary</th>
     </tr>
    <%--    создадим строки--%>

    <c:forEach var="empl" items="${listAllEmployeeAttribute}">
        <tr>
             <td>${empl.name}</td>
            <td>${empl.surname}</td>
            <td>${empl.department}</td>
            <td>${empl.salary}</td>
        </tr>
    </c:forEach>


</table>


<input type="button" value="add"
       onclick="window.location.href= 'addEmployeeView'"/>
</body>
</html>
