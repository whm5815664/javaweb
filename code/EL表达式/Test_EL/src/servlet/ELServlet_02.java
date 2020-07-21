package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.Address;
import data.User;

@WebServlet("/elservlet_02")
public class ELServlet_02 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// 设置请求编码格式
		req.setCharacterEncoding("utf-8");
		
		// 设置响应编码格式
		resp.setContentType("text/html;charset=utf-8");
		
		// 获取请求信息
		
		// 处理请求
		
		// List —— String
		List<String> list = new ArrayList<String>();
		list.add("qwer哈哈哈123");
		list.add("asdf哈哈哈321");
		list.add("zxcv哈哈哈123");
		
		req.setAttribute("list", list);
		
		// List —— User
		User u1 = new User(101, "小明", "ETC", new Address("湖北省", "武汉市", "武昌区"));
		User u2 = new User(102, "小方", "有点方", new Address("湖北省", "武汉市", "洪山区"));
		User u3 = new User(103, "小花", "敲代码", new Address("湖北省", "武汉市", "青山区"));
		
		List<User> ulist = new ArrayList<User>();
		ulist.add(u1);
		ulist.add(u2);
		ulist.add(u3);
		
		req.setAttribute("ulist", ulist);
		
		// Map —— String
		Map<String, String> map = new HashMap<String, String>();
		map.put("Q", "qwer");
		map.put("A", "asdf");
		map.put("Z", "zxcv");
		
		req.setAttribute("map", map);
		
		// Map —— User
		Map<String, User> umap = new HashMap<String, User>();
		umap.put("u1", u1);
		umap.put("u2", new User(102, "小方", "有点方", new Address("湖北省", "武汉市", "洪山区")));
		umap.put("u3", new User(103, "小花", "敲代码", new Address("湖北省", "武汉市", "青山区")));
		
		req.setAttribute("umap", umap);
		
		// 响应请求
		// 使用转发进行跳转
		req.getRequestDispatcher("/el_02.jsp").forward(req, resp);
		
		// 使用重定向进行跳转（周末自行尝试）
	}
}
