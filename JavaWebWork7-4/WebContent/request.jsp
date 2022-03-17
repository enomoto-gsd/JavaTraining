<%@page import = "model.User" %>
<%@page import = "java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%ArrayList<User> userList = (ArrayList<User>)session.getAttribute("userList");
	if(userList != null ){
	%>


	<table>
	<tr>
		<th>テストID</th><th>Password</th>
	</tr>
<% for(int i=0; i<userList.size(); i++){ 
	
%>
	
	<tr>
		<td><%=userList.get(i).getTestId()%></td>
		<td><%=userList.get(i).getPassword()%></td>
	</tr>
	</table>
<%
		}
	}
%>
		
		<form action="WebWork74" method="post">
			<p>ID:<input type="text" name="testId"></p>
			<p>Password<input type="text" name="password"></p>
			<p><input type="submit" value = "登録" ></p>
			
		</form>
</body>
</html>