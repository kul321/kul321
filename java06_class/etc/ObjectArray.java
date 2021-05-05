package java06_class.etc;

public class ObjectArray {
	public static void main(String[] args) {
		//객체 배열
		
		Student st = new Student("Alice", 50);
		
		//-------------------------------------
		
		Student[] stuArr; //String타입의 배열 변수 선언
		
		stuArr = new Student[3]; //Student타입으로 배열을 생성
		
//		stuArr[0].setName("Alice); //NullPointerException발생
//		stuArr[0] = new Student("Bob",22); //객체 생성이 필요하다
		
		//------------------------------------------
		
		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
			
			
		}
		
		
		//-------------------------------------
//		아니면 일일이 지정
//		stuArr[0] = new Student("Alice", 11);
//		stuArr[1] = new Student("Bob", 11);
//		stuArr[2] = new Student("Clare", 11);
		
		
		
	}

}
