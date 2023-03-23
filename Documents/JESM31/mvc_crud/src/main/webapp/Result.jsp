<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
${msg}
<table style="1">
<tr>
<td>Id</td>
<td>Name</td>
<td>Email</td>
<td>Phone </td>
<td>Dob</td>
<td>Standard</td>
<td>Age</td>
<td>Delete</td>
<td>Edit</td>
</tr>

<c:forEach var="student" items="${list}">
<tr>
<td>${student.getId()}</td>
<td>${student.getName()}</td>
<td>${student.getEmail()}</td>
<td>${student.getMobile()} </td>
<td>${student.getDob()}</td>
<td>${student.getStandard()}</td>
<td>${student.getAge()}</td>
<td><a href="delete?id=${student.getId()}"><button >Delete</button></a></td>
<td><a href="edit?id=${student.getId()}"><button>Edit</button></a></td>
</tr>
</c:forEach>

</table>


</body>
</html>