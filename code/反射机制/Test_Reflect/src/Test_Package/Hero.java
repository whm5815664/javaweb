package Test_Package;

public class Hero {

	// 私有属性
	private String bigname;
	private String smallname;
	
	
	// 公有方法
	public String getBigname() {
		return bigname;
	}
	public void setBigname(String bigname) {
		this.bigname = bigname;
	}
	
	public String getSmallname() {
		return smallname;
	}
	public void setSmallname(String smallname) {
		this.smallname = smallname;
	}
	
	
	@Override
	public String toString() {
		return "Hero [bigname=" + bigname + ", smallname=" + smallname + "]";
	}
	
	
	// 无参构造
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// 有参构造
	public Hero(String bigname, String smallname) {
		super();
		this.bigname = bigname;
		this.smallname = smallname;
	}
	
	
	// 私有方法
	private String fun_private( int num ) {
		
		if ( num > 2000 ) {
			
			return "哥果然是个高手！带我上个黄金如何？";
		}
		else {
			
			return "咱俩一起上黄金，可好？";
		}
	}
	
	
	// 保护、私有方法
	protected void skill_Q() {
		
		System.out.println("施放技能——Q");
	}
	
	protected void skill_W() {
		
		System.out.println("施放技能——W");
	}
	
	private void skill_E() {
		
		System.out.println("施放技能——E");
	}
	
	private void skill_R() {
		
		System.out.println("施放技能——R");
	}
}
