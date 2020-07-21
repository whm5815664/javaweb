package data;

public class User {

	private int uid;
	private String uname;
	private String uhobby;
	private Address uaddr;
	
	
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
	
	public String getUhobby() {
		return uhobby;
	}
	public void setUhobby(String uhobby) {
		this.uhobby = uhobby;
	}
	
	public Address getUaddr() {
		return uaddr;
	}
	public void setUaddr(Address uaddr) {
		this.uaddr = uaddr;
	}
	
	
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", uhobby=" + uhobby + ", uaddr=" + uaddr + "]";
	}
	
	
	public User(int uid, String uname, String uhobby, Address uaddr) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.uhobby = uhobby;
		this.uaddr = uaddr;
	}
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
