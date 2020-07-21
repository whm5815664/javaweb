package com.xxx.dao;

import com.xxx.data.User;

public interface LoginDao {

	public User checkLoginDao(String username, String password);

	public User checkUidDao(String uid);

}
