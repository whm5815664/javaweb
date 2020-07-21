<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 利用JSP命令进行导包 -->
<%@ page import="data.*,java.util.*"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>EL表达式测试页面</title>
	</head>
	
	<body>
	
		<h2>使用传统方式获取请求中的数据</h2>
		<b><%=((ArrayList)request.getAttribute("list")).get(0)%></b>
		<br>
		<b><%=((ArrayList)request.getAttribute("ulist")).get(0)%></b>
		<br>
		<b><%=((User)((ArrayList)request.getAttribute("ulist")).get(0)).getUhobby()%></b>
		<br>
		<b><%=((User)((ArrayList)request.getAttribute("ulist")).get(0)).getUaddr().getTown()%></b>
		<br>
		<br>
		<b><%=((HashMap)request.getAttribute("map")).get("Q")%></b>
		<br>
		<b><%=((HashMap)request.getAttribute("umap")).get("u3")%></b>
		<br>
		<b><%=((User)((HashMap)request.getAttribute("umap")).get("u3")).getUhobby()%></b>
		<br>
		<b><%=((User)((HashMap)request.getAttribute("umap")).get("u3")).getUaddr().getTown()%></b>
		
		
		<hr>
		
		
		<h2>使用EL表达式获取请求中的数据</h2>
		<b>${list[1]}</b>
		<br>
		<b>${ulist[0]}</b>
		<br>
		<b>${ulist[0].uhobby}</b>
		<br>
		<b>${ulist[0].uaddr.town}</b>
		<br>
		<br>
		<b>${map.A}</b>
		<br>
		<b>${umap.u3}</b>
		<br>
		<b>${umap.u3.uhobby}</b>
		<br>
		<b>${umap.u3.uaddr.town}</b>
		
	</body>
</html>








