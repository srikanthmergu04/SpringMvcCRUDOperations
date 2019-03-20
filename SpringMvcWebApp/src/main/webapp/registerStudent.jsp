<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Fill the Student Details

 <form:form action = "registerSuccess" method="post" modelAttribute="student">
  <table>

			<tr>
				<td>Id</td>
				<td><form:input path="id"/></td>
			</tr>

			<tr>
				<td>Name</td>
				<td><form:input path="sName"/></td>
			</tr>


			<tr>
				<td>Age</td>
				<td><form:input path="age"/></td>
			</tr>
				<td>Department</td>
				<td><form:input path="dept"/></td>


			<tr>
			</tr>
				<td>City</td>
				<td><form:input path="city"/></td>


			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
    </table>
  </form:form>

</body>
</html>