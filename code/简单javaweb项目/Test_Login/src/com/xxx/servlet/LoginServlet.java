package com.xxx.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xxx.data.User;
import com.xxx.service.LoginService;
import com.xxx.service.LoginServiceImpl;


/*
 * 	当前servlet负责接收点击“登录”按钮之后，发来的请求
 * 
 * 	获取请求中“携带”的用户信息（账号，密码）
 * 
 * 	调用后台的相关 服务去比对用户信息，看用户是否存在，以此来判定登录是否成功	
 * 
 * 	处理 用户在登录页面点击“登录”按钮之后发送的请求
 * 
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求的编码格式
		req.setCharacterEncoding("UTF-8");
		
		// 设置响应的编码格式
		resp.setContentType("text/html;charset=UTF-8");
		
		// 获取请求信息
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println("账号：" + username);
		System.out.println("密码：" + password);
		
		// 处理请求
		// 创建业务层处理对象
		LoginService ls = new LoginServiceImpl();
		User u = ls.checkLoginService(username, password);
		System.out.println(u);
		
		// 返回处理结果
		if ( u != null ) {
			
			// 登录成功，画个登录成功的页面
//			System.out.println(u);
			// 跳转到登录之后的主页面 —— 使用转发的方式
//			req.getRequestDispatcher("mainpage").forward(req, resp);
			
			
			// 创建 cookie 信息，实现登录状态的保持
			Cookie c1 = new Cookie("uid", u.getUid()+"");
			
			// 在添加到响应之前，进行设置
			// 设置持续的时间长度
			c1.setMaxAge(60);
			// 设置访问的地址
			c1.setPath("/Test_Login/cookie");
			
			// 添加Cookie信息到浏览器的响应中
			resp.addCookie(c1);
			
			// 将用户数据存放在服务器的某个地方 —— session
			HttpSession hs = req.getSession();
			hs.setAttribute("user", u);
			
			// 跳转到登录之后的主页面 —— 使用重定向的方式
			resp.sendRedirect("mainpage");
			
			return;
			
		} else {
			
			// 登录不成功，重新回到登录页面
//			System.out.println(u);
			
			// 在跳转到登录页面之前，在请求中加入一个标志性的消息，告诉用户，上次输入有误
			req.setAttribute("str", "输入的账号或密码有误！！！");
			
			req.getRequestDispatcher("loginpage").forward(req, resp);
			
			return;
		}
	}
}




