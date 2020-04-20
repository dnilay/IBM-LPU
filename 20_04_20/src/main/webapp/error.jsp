<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<String> list=(List<String>)request.getAttribute("error");
for(String str: list)
{
	out.println(str+"<br/>");
}
	
%>
</body>
</html>