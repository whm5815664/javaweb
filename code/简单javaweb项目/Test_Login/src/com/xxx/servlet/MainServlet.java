package com.xxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.data.User;


@WebServlet("/mainpage")
public class MainServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求的编码格式
		req.setCharacterEncoding("UTF-8");
		
		// 设置响应的编码格式
		resp.setContentType("text/html;charset=UTF-8");
		
		// 处理请求
		// 通过jsessionid去找到session中存放的User对象（上一次请求从数据库中获取到的用户信息）
		User u = (User)req.getSession().getAttribute("user");
		
		// 画个登录之后的主页面
		resp.getWriter().write("<html>");
		resp.getWriter().write("<head>");
		resp.getWriter().write("</head>");
		resp.getWriter().write("<body>");
		// 从请求中获取到登录的用户信息
//		resp.getWriter().write("<h2>" + req.getParameter("username") + " 欢迎来到登录之后的主页面！！！</h2>" );
		resp.getWriter().write("<h2>" + u.getUname() + " 欢迎来到登录之后的主页面！！！</h2>" );
		
		// 添加一个按钮，点击跳转新得页面，显示用户信息
		resp.getWriter().write("<br>");
		resp.getWriter().write("<form action='showpage' method='get'>");
		resp.getWriter().write("<input type='submit' value='查看个人信息'>");
		resp.getWriter().write("</form>");
		
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
		
	}
}
