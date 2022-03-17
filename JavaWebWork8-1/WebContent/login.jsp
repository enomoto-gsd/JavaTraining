<%@page import ="model.LoginUser" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%LoginUser user= (LoginUser)session.getAttribute("loginuser"); %>
		<%if(user != null){
		%>
			<p>ユーザID:<%=user.getId()%>がログインしました。</p>
		<% 	
		}
		%>
		<h2>ユーザー管理</h2>
		<p>ログイン</p>
		<form action ="WebWork81" method= "post">
			<p>ID<input type="text" name = id></p>
			<p>パスワード<input type ="password" name = password>
			<p><input type="submit" value="ログイン"></p>
		</form>
		
		<%if(user != null){
		%>
			<p>ユーザID:<%=user.getId()%>がログインしています。ログアウトしますか。</p>
			<form action= "WebWork81" method="get">
			<p><input type="submit" value= "ログアウト"></p>
			</form>
		<% 	
		}
		%>
</body>
</html>