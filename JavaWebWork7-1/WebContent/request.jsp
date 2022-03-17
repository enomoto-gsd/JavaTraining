<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ユーザー管理</h1>
	<p>氏名と年齢を入力してください</p>
	<form action ="WebWork71" method = "post">
		<p>氏名:<input type = "text" name = "name"/></p>
		<p>年齢:<input type= "text" name = "age" /></p>
		<p><input type="submit" value= "登録" /></p>
	</form>
	
	<h2>ユーザー確認</h2>
		<p>登録されているユーザの一覧を表示します。</p>
		<form action = "WebWork71" method = "get">
			<input type= "submit" value ="表示"/>
		</form>
</body>
</html>