<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 利用JSP命令进行导包 -->
<%-- <%@ page import="data.*"%> --%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL表达式测试页面</title>
	</head>
	
	<body>
	
		<h2>使用传统方式获取请求中的数据</h2>
		<%-- <b><%=(User)request.getAttribute("user")%></b>
		<br>
		<b><%=((User)request.getAttribute("user")).getUhobby()%></b>
		<br>
		<b><%=((User)request.getAttribute("user")).getUaddr().getCity()%></b> --%>
		
		
		<hr>
		
		
		<h2>使用EL表达式获取请求中的数据</h2>
		<b>${user}</b>
		<br>
		<b>${user.uhobby}</b>
		<br>
		<b>${user.uaddr.city}</b>
		
		
	</body>
</html>








