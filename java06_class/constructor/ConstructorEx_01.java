package java06_class.constructor;

//java06_class.constructor.
class Constructor {
	//멤버 필드
	private int num1;
	private int num2;
	
//	private int num1 = 111;
//	private int num2 = 222; <- 멤버필드에서 먼저초기화
	
	
	//디폴트 생성자
	//  -> 매개변수가 없는 생성자
	public Constructor() {
		System.out.println("디폴트 생성자 호출됨");
		
		System.out.println("--- 생성자 이용 초기화 전 ---");
		System.out.println("num1: "+ num1 + ", num2: "+num2);
		
		//멤버필드 초기화
		num1 = 500;
		num2 = 600;
		System.out.println("--- 생성자 이용 초기화 후 ---");
		System.out.println("num1: "+ num1 + ", num2: "+num2);
	}
	
	//매개변수가 있는 생성자 (오버로딩)
	public Constructor(int num1, int num2) {
		
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}



//java06_class.constructor.ConstructorEx_01
public class ConstructorEx_01 {

	public static void main(String[] args) {
		
		//객체변수
		Constructor cons;
		
		//객체생성
		cons = new Constructor();
		
		//-----------------------------------
		System.out.println("-------------");
		
		Constructor cons02;
		cons02 = new Constructor(333, 444);
		
		System.out.println("cons: "+ cons.getNum1()+", "+cons.getNum2());
		System.out.println("cons02: "+ cons02.getNum1()+", "+cons02.getNum2());
		
	}

}
//ctrl+shift+ [ : 수직 화면 분할  
//ctrl+shift+ - : 수평 화면 분할