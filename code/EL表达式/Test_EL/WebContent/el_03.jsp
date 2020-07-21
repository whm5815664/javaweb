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
	
		<h2>空值判断</h2>
		${empty str}
		<br>
		${empty user}
		<br>
		${empty list}
		<br>
		${empty map}
		
		
		<hr>
		
		
		<h2>运算、逻辑表达式</h2>
		<b>1+2 = ${1+2}</b>
		<br>
		<b>10*2 = ${10*2}</b>
		<br>
		<b>1>2 = ${1>2}</b>
		<br>
		<b>2==2 = ${2==2}</b>
		<br>
		<b>1是否大于2 = ${1>2?"1>2":"1<=2"}</b>
		<br>
		<b>1+"10" = ${1+"10"}</b>
		
	</body>
</html>








