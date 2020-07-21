package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elservlet")
public class ELServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求编码格式
		req.setCharacterEncoding("utf-8");
		
		// 设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		// 获取请求信息
		String uname = req.getParameter("name");
		String upwd = req.getParameter("pwd");
		
		// 处理请求
		System.out.println("账号：" + uname);
		System.out.println("密码：" + upwd);
		
		// 在请求中添加一个字符串，让request对象携带进行传递
		req.setAttribute("str", "今天周五了，一会下课去开个黑！");
		
		// 响应请求
		// 使用转发进行跳转
		req.getRequestDispatcher("/el.jsp").forward(req, resp);
		
		// 使用重定向进行跳转（周末自行尝试）
	}
}
