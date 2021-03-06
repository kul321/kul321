package java12_exception.custom;

//Exception 클래스 상속받기 -> Checked Exception 클래스 만들기
//public class UserAgeException extends Exception {

//RuntimeException 클래스 상소받기 -> Unchecked Exception 클래스 만들기
public class UserAgeException extends RuntimeException{
	
	@Override
	public String getMessage() {//예외 메시지(발생 이유)를 반환하는 메소드
		return "나이는 0보다 작거나 150보다 클 수 없다";
	}
}


//RuntimeException 클래스 상속받기 -> Unchecked Exception 클래스 만들기
//public class UserAgeException extends RuntimeException {
//}
