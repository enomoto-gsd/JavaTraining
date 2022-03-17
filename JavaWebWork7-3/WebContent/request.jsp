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
	<form action ="WebWork73" method ="post">
		<p><input type="text" name ="name" /></p>
		<p><input type ="submit" value="セッションスコープ内のデータを表示"></p>
	</form>
	<br />
	<form action="WebWork73" method ="get">
			<input type ="submit" value="Sessionを破棄">
	</form>
</body>
</html>