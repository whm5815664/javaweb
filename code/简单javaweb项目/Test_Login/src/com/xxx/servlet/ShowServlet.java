package com.xxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.data.User;

@WebServlet("/showpage")
public class ShowServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 设置请求的编码格式
		req.setCharacterEncoding("UTF-8");
		
		// 设置响应的编码格式
		resp.setContentType("text/html;charset=UTF-8");
		
		// 获取请求信息（jsessionid）
		HttpSession hs = req.getSession();
		
		// 利用jsessionid获取session中存放的用户信息
		User u = (User)hs.getAttribute("user");
		
		// 画个显示个人信息的页面
		resp.getWriter().write("<html>");
		resp.getWriter().write("<head>");
		resp.getWriter().write("</head>");
		resp.getWriter().write("<body>");
		
		resp.getWriter().write("<h2>" + u.getUname() + " 个人信息：</h2>");
		resp.getWriter().write("<table>");
		resp.getWriter().write("<tr>");
		resp.getWriter().write("<td>编号：</td>");
		resp.getWriter().write("<td>" + u.getUid() + "</td>");
		resp.getWriter().write("</tr>");
		resp.getWriter().write("<tr>");
		resp.getWriter().write("<td>账号：</td>");
		resp.getWriter().write("<td>" + u.getUname() + "</td>");
		resp.getWriter().write("</tr>");
		resp.getWriter().write("<tr>");
		resp.getWriter().write("<td>密码：</td>");
		resp.getWriter().write("<td>" + u.getUpwd() + "</td>");
		resp.getWriter().write("</tr>");
		resp.getWriter().write("</table>");
		
		resp.getWriter().write("</body>");
		resp.getWriter().write("</html>");
		
	}
}






