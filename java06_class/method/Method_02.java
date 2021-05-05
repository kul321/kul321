package java06_class.method;

public class Method_02 {
	//매개변수(parameter, argument)
	//반환데이터(return)
	
	//--------------------------------
	
	//매개변수x , 반환데이터x
	public void method1() {
		System.out.println("Hello");
		
	}
	
	//매개변수o, 반환데이터x
	public void method2(int parameter) {//매개변수 ==parameter
		System.out.println("전달된 값 : "+parameter);
	}
	//매개변수x, 반환데이터o
	public int returnNum() {
		return 333;
	}
	//----------------------------------
	//매개변수o, 반환데이터o
	public int plus(int n1, int n2) {
		return n1+n2;
	}
}
