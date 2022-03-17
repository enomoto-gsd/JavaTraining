<%@page import ="model.LoginUser" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン中</title>
</head>
<body>
		
		<h2>ユーザー管理</h2>
		<p>ログイン</p>
		<form action ="WebWork81" method= "post">
			<p>ID<input type="text" name = id></p>
			<p>パスワード<input type ="password" name = password>
			<p><input type="submit" value="ログイン"></p>
		</form>
		
</body>
</html>