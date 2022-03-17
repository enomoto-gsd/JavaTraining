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
	<p>データを入力</p>
	<form action = "WebWork72" method = "post">
		<input type= "text"  name ="name"/>
		<input type="submit" value ="登録">
	</form>
</body>
</html>