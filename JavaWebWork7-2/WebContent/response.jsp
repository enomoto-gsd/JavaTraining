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
		String applicationData =(String)application.getAttribute("name");
		String requestData = (String)request.getAttribute("name");
		String sessionData = (String)session.getAttribute("name");
	%>
		アプリケーションスコープ:<%=applicationData %>
		リクエストスコープ:<%=requestData %>
		セッションスコープ:<%=sessionData %>
		
		<a href ="request.jsp">リクエストに戻る</a>
</body>
</html>