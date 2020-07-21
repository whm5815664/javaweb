package com.xxx.data;

/*
 * 	用来记录一个用户的信息
 * 
 * 	在数据库中的 id
 * 	账号、密码
 * 
 */
public class User {

	private int uid;
	private String uname;
	private String upwd;
	
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + "]";
	}
	
}
