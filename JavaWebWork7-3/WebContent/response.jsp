<%@page import ="controller.WebWork73" %>
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
			String name = (String)session.getAttribute("name");
		%>
		<%= "sessionスコープの値は" +name %>
		
		<p><a href="request.jsp">戻る。</a></p>
		
</body>
</html>