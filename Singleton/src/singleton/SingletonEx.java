package singleton;

public class SingletonEx {
	public static void main(String[] args) {
		
		Singleton_01 s1 = Singleton_01.getInstance();
		Singleton_01 s2 = Singleton_01.getInstance();
		Singleton_01 s3 = Singleton_01.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("--------------------");
		
//		Singleton_01 s4 = new Singleton_01();
//		Singleton_01 s5 = new Singleton_01();
//		
//		System.out.println(s4);
//		System.out.println(s5);
		
		System.out.println("--------------------");
		
		Singleton_02 s6 = Singleton_02.getInstance();
		Singleton_02 s7 = Singleton_02.getInstance();
		
//		Singleton_02 s8 = new Singleton_02();
		
		System.out.println( s6 );
		System.out.println( s7 );
		
		System.out.println("--------------------");
		
		Singleton_03 s9 = Singleton_03.getInstance();
		Singleton_03 s10 = Singleton_03.getInstance();
		
		System.out.println(s9);
		System.out.println(s10);
		
	}
}













