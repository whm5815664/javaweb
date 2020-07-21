package Default_Package;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//import Test_Package.Hero;

public class ReflectClass {

	// 创建一个对象
	/*
	 * public static void create_object() {
	 * 
	 * try {
	 * 
	 * // 使用绝对路径去访问 hero类型的基本信息 Class c1 = Class.forName("Test_Package.Hero");
	 * 
	 * Object obj = c1.newInstance();
	 * 
	 * Hero h1 = (Hero)obj;
	 * 
	 * h1.setBigname("德玛西亚之力"); h1.setSmallname("盖伦");
	 * 
	 * System.out.println(h1);
	 * 
	 * } catch (Exception e) {
	 * 
	 * e.printStackTrace(); } }
	 */
	
	
	// 获取里面所有的构造方法
	public static void all_Constructor() {
		
		try {
			
			Class c1 = Class.forName("Test_Package.Hero");
			
			// 获取公有的
			Constructor[] con_arr = c1.getConstructors();
			// 获取所有的
//			Constructor[] con_arr = c1.getDeclaredConstructors();
			
			for (Constructor temp : con_arr) {
				
				System.out.println(temp);
			}
			
//			System.out.println(con_arr[1]);
			
			Object obj = con_arr[1].newInstance("披甲龙龟","龙龟");
			
			System.out.println("obj = " + obj);
			
//			Hero h2 = (Hero)obj;
			
//			System.out.println("h2 = " + h2);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
	
	
	// 获取里面所有的属性
	public static void all_field() {
		
		try {
			
			Class c1 = Class.forName("Test_Package.Hero");
			
			Object obj = c1.newInstance();
			
//			Field f1 = c1.getField("bigname");
			Field f1 = c1.getDeclaredField("bigname");
			
			System.out.println(f1);
			
			f1.setAccessible(true);
			
			f1.set(obj, "test_name_01");
			
			System.out.println(obj);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	
	// 获取里面所有的方法
	public static void all_method() {
		
		try {
			
			Class c1 = Class.forName("Test_Package.Hero");
			
			Object obj = c1.newInstance();
			
			Method[] m_public = c1.getMethods();
			
			for (Method method : m_public) {
				
				System.out.println(method);
			}
			
			
			System.out.println("-----------------------------");
			
			
			Method m1 = c1.getMethod("setBigname", String.class);
			
			System.out.println(m1);
			
			m1.invoke(obj, "test_name_02");
			
			Method m2 = c1.getMethod("getBigname");
			
			String bigstr = (String)m2.invoke(obj);
			
			System.out.println(m2);
			
			System.out.println(bigstr);
			
			System.out.println(obj);
			
			
			System.out.println("-----------------------------");
			
			
//			Method[] m_all = c1.getDeclaredMethods();
//			
//			for (Method method : m_all) {
//				
//				System.out.println(method);
//			}
//			
//			m_all[4].setAccessible(true);
//			
//			String str = (String)m_all[4].invoke(obj, 1200);
//			
//			System.out.println(str);
			
			
			System.out.println("-----------------------------");
			
			
			Method m3 = c1.getDeclaredMethod("fun_private", int.class);
			
			m3.setAccessible(true);
			
			String str = (String)m3.invoke(obj, 1200);
			
			System.out.println(str);
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}









