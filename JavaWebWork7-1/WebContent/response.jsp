<%@page import = "model.Human" %>
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
	<h1>現在のメンバー</h1>
		<%
			ArrayList<Human> list = (ArrayList<Human>)request.getAttribute("human");
		
		 for(int i=0; i<list.size(); i++){ 
			 Human human = list.get(i);
		%>
			<P><%=(i+1) %>人目</P>
			<p><%=human.getName()%>
			<p><%=human.getAge()%></p>
		<% 
		 }	
		%> 
</body>
</html>