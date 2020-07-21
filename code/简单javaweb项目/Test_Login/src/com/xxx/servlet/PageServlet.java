package com.xxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * 	当前的servlet负责向浏览器返回一个登陆页面，
 * 
 * 	用户可以在这个页面输入内容
 * 
 * 	点击登录按钮，进行登录行为
 * 
 * 	处理用户在浏览器地址栏输入的访问地址
 * 	http://localhost:8080/Test_Login/loginpage
 */
@WebServlet("/loginpage")
public class PageServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求的编码格式
		req.setCharacterEncoding("UTF-8");
		
		// 设置响应的编码格式
		resp.setContentType("text/html;charset=UTF-8");
		
		// 处理请求
		// 将loginservlet中 else语句块中添加到请求中的键值对数据获取出来
		String str = (String)req.getAttribute("str");
		
		// 画个登录页面
		resp.getWriter().write("<html>");
		resp.getWriter().write("<head>");
		resp.getWriter().write("</head>");
		resp.getWriter().write("<body>");
		
		// 根据请求中是否存在非空的 str信息的键值对，来判断是否需要打印这句话
		if ( str != null ) {
			resp.getWriter().write("<font color='red' size='20px'>" + str + "</font>");
		}
		
		resp.getWriter().write("<form action='login' method='get'>");
		resp.getWriter().write("账号：<input type=\"text\" name=\"username\" value=\"\"><br>");
		resp.getWriter().write("密码：<input type=\"text\" name=\"password\" value=\"\"><br>");
		resp.getWriter().write("<input type=\"submit\" value=\"登录\">");
		resp.getWriter().write("</form>");
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
	}
}
