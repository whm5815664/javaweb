package com.xxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xxx.data.User;
import com.xxx.service.LoginService;
import com.xxx.service.LoginServiceImpl;


@WebServlet("/cookie")
public class CookieServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求编码格式
		req.setCharacterEncoding("UTF-8");
		
		// 设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		// 获取请求中的信息
		// 从请求中获取到 缓存的信息
		Cookie[] arr = req.getCookies();
		
		// 对 cookie对象存在
		if ( arr != null ) {
			
			String uid = "";
			
			//foreach循环遍历arr，取出cookie名为uid的值
			for ( Cookie temp : arr ) {
			
				if ( "uid".equals( temp.getName() )) {
					
					uid = temp.getValue();
				}
			}
			
			//根据uid的值进行不同操作
			if ( "".equals(uid) ) {
				
				// uid为空，用户不存在跳转到登录页面，重新登录新的用户
				req.getRequestDispatcher("loginpage").forward(req, resp);
				
				return;
				
			} else {
				
				// uid不为空，需要使用数据库工具对象进行登录效验
				// 获取业务层对象
				LoginService ls = new LoginServiceImpl();
				
				User u = ls.checkUidService( uid );
				
				if ( u != null ) {
					
					// 将用户登录之后的信息内容存放在 session 中
					req.getSession().setAttribute("user", u);
					
					// 重定向到登陆之后的主页面
					resp.sendRedirect("mainpage");
					
					return;
					
				} else {
					
					// 没有cookie 跳转到登录页面进行登录
					req.getRequestDispatcher("loginpage").forward(req, resp);
					
					return;
					
				}
			}
			
		} else {
			
			// 没有cookie对象，直接跳转到登录页面进行登录
			req.getRequestDispatcher("loginpage").forward(req, resp);
			
			return;
			
		}
	}
}




