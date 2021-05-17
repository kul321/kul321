package java11_generic;

//일반 클래스
class Class03{
	//제네릭 메소드
	public <T> void display(int num) {
		int data;
		data = num;
		
	}//display(int)end
	
	//반환타입, 매개변수에서 제네릭 타입 사용
	public <T> T out(T obj) {
		T data;//지역변수에서 제네릭 타입 사용
		data = obj;
		return data;
	
	}//out(T obj) end
}//Class03 end

public class Generic_03_GenericMethod {

	public static void main(String[] args) {
		Class03 c03 = new Class03();
		
		c03.out(12345); //타입파라미터를 전달안함, T -> Integer(자동 변환)
		c03.<Double>out(45.76);//타입파라미터를 Double로 전달, T->Double(자동이 아니라 명시)
	}//main() end

}//Generic_03_GenericMethod end
