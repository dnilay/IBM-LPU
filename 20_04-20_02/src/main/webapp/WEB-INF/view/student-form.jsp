<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" method="post" modelAttribute="student">

<label>First Name:</label><form:input path="firstName" /><br/>
<label>Last Name:</label><form:input path="lastName"/><br/>
<label>Email:</label><form:input path="email"/><br/>
<input type="submit">
</form:form>
</body>
</html>