package java06_class.overloading;

public class Overloading {
	
	//멤버필드
	private int x;
	private int y;
	
	//멤버필드 x,y를 출력하는 기능 - 멤버메소드
	public void display() {
		System.out.println("("+x+", "+y+")");
		
	}
	//멤버필드 x,y에 값을 저장하고나서 출력하는 기능 - 멤버메소드
	//근데 위와 이름이 같다
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("("+this.x + ", "+this.y+")");
	}
	//---------------------------------
	public void display(double d) {
		
	}
	public void display(String str) {
		
	}
//	public int display() {<-리턴타입만 다를 경우 오버로딩 성립 불가 
//	}
	
}
