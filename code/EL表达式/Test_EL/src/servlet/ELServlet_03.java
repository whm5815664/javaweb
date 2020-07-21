package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

import data.Address;
import data.User;

@WebServlet("/elservlet_03")
public class ELServlet_03 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求编码格式
		req.setCharacterEncoding("utf-8");
		
		// 设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		// 获取请求信息
		
		// 处理请求
		req.setAttribute("str", "");
		req.setAttribute("user", new User());
		req.setAttribute("list", new ArrayList());
		req.setAttribute("map", new HashMap());
		
		// 响应请求
		// 使用转发进行跳转
		req.getRequestDispatcher("/el_03.jsp").forward(req, resp);
		
		// 使用重定向进行跳转（周末自行尝试）
	}
}
