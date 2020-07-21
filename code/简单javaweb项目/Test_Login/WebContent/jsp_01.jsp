<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>这是一个jsp页面选项卡标题</title>
    </head>
    
    <body>
           <b>今天是星期四 是2020年7月16日</b>
           
           <hr>
           
           <!-- 以下是java局部变量 -->
           <% 
                //写java代码的地方
                int n = 16;
                
                if(n%2 == 0){
           %>   
                     <b>2020年</b>
           <%
                }
                
           %>
           
           <!-- 以下是全局代码块 -->
           <%!
                public void fun()
                {
        	   
                }
           
           %>
           
           <jsp:forward page="jsp_01_forward.jsp">
           
                <jsp:param value="" name="" />
           
           </jsp:forward> 
           
           
           
    </body>
</html>