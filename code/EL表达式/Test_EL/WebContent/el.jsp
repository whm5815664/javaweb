<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL表达式测试页面</title>
	</head>
	
	<body>
	
		<h2>使用传统方式获取请求中的数据</h2>
		
		<!-- 获取浏览器地址栏中的参数 -->
		<b>从浏览器地址栏中获取的账号：<%=request.getParameter("name")%></b>
		<br>
		<b>从浏览器地址栏中获取的密码：<%=request.getParameter("pwd")%></b>
		<br>
		<b>从请求中携带过来的str：<%=request.getAttribute("str")%></b>
		
		
		
		<hr>
		
		
		
		<h2>使用EL表达式获取请求中的数据</h2>
		
		<!-- 获取浏览器地址栏中的参数 -->
		<b>${param.name}</b>
		<br>
		<b>${param.pwd}</b>
		<br>
		<b>${str}</b>
		
	</body>
</html>








