package com.xxx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.xxx.data.User;

/*
 * 	在后台负责进行数据库的访问
 * 
 * 	这里需要规范访问方式，以及对数据库里面的内容进行比对
 * 	为了实现 loginservice里面的实际业务功能
 * 	
 */
public class LoginDaoImpl implements LoginDao {

	@Override
	public User checkLoginDao(String username, String password) {

		// 数据库连接对象
		Connection conn = null;
		
		// 数据库操作对象
		PreparedStatement ps = null;
		
		// 查询并接受返回的结果的对象
		ResultSet res = null;
		
		User u = null;
		
		try {
			
			// 加载驱动-5.7版本
			Class.forName("com.mysql.jdbc.Driver");
			// 加载驱动-8.0版本
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_01?characterEncoding=UTF-8","root","");
			
			// 数据库操作对象
			ps = conn.prepareStatement("select * from t_user where user_name=? and user_password=?;");
			
			// 给 ？ 占位符进行传参
			ps.setString(1, username);
			ps.setString(2, password);
			
			// 查询并接受返回的结果
			res = ps.executeQuery();
			
			// 分离查询结果中的字段，获取账号、密码
			while ( res.next() ) {
				u = new User(); // 必须得有用来接受数值的实体对象
				u.setUid( res.getInt("user_id"));
				u.setUname( res.getString("user_name"));
				u.setUpwd( res.getString("user_password"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// 关闭相关的操作对象
				res.close();
				ps.close();
				conn.close();
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}

		}
		
		return u;
	}

	
	
	@Override
	public User checkUidDao(String uid) {
		
		// 数据库连接对象
		Connection conn = null;
		
		// 数据库操作对象
		PreparedStatement ps = null;
		
		// 查询并接受返回的结果的对象
		ResultSet res = null;
		
		User u = null;
		
		try {
			
			// 加载驱动-5.7版本
			Class.forName("com.mysql.jdbc.Driver");
			// 加载驱动-8.0版本
//			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123");
			
			// 数据库操作对象
			ps = conn.prepareStatement("select * from t_user where user_id=?;");
			
			// 给 ？ 占位符进行传参
			ps.setString(1, uid);
			
			// 查询并接受返回的结果
			res = ps.executeQuery();
			
			// 分离查询结果中的字段，获取账号、密码
			while ( res.next() ) {
				u = new User(); // 必须得有用来接受数值的实体对象
				u.setUid( res.getInt("user_id"));
				u.setUname( res.getString("user_name"));
				u.setUpwd( res.getString("user_password"));
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// 关闭相关的操作对象
				res.close();
				ps.close();
				conn.close();
				
			} catch (Exception e2) {

				e2.printStackTrace();
			}

		}
		
		return u;
	}

}










