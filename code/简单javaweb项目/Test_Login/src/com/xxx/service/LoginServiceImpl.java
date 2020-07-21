package com.xxx.service;

import com.xxx.dao.LoginDao;
import com.xxx.dao.LoginDaoImpl;
import com.xxx.data.User;

/*
 * 	在后台负责处理实际业务逻辑的类
 * 
 * 	主要功能
 * 		1：根据账号密码去数据库进行查询，如果找到，则返回数据库中用户的信息，如果没有则返回空
 * 
 * 		2：根据缓存（Cookie）中的用户编号（Uid）去数据库进行查询，如果找到，则返回数据库中用户的信息，如果没有则返回空
 * 
 */
public class LoginServiceImpl implements LoginService {

	// 创建一个数据库操作对象
	LoginDao ld = new LoginDaoImpl();
	
	
	
	// 主要功能 1
	@Override
	public User checkLoginService(String username, String password) {

		// 用数据库的操作对象去数据库里面检查有没有这个用户
		// 根据用户名和密码去查询
		return ld.checkLoginDao(username, password);
	}

	
	// 主要功能 2
	@Override
	public User checkUidService(String uid) {

		// 用数据库的操作对象去数据库里面检查有没有这个用户
		// 根据用户编号去查询
		return ld.checkUidDao(uid);
	}
}


