package com.xxx.service;

import com.xxx.data.User;

public interface LoginService {

	// 检查用户输入的登录信息
	public User checkLoginService( String username, String password );

	// 检查 uid （cookie记录）
	public User checkUidService( String uid );
	
}
