package singleton;

//단점 보완
//	1. 예외처리(추가작업)할 수 없음
//	 -> getInstance() 메소드 내에서 해결

//	2. 객체를 사용하지 않아도 생성한다
//	 -> 지연된 초기화(Lazy Initialization)로 해결
//	 -> 싱글톤객체를 최초로 사용할 때까지 객체 생성을 미룬다

public class Singleton_03 {

	public String data = "Apple"; //데이터
	
	//private 생성자 - 외부에서 객체 생성 금지
	private Singleton_03() { }
	
	//자기 클래스 객체 변수
	private static Singleton_03 instance;
	
	//싱글톤 객체 반환 메소드
	public static Singleton_03 getInstance() {
		// getInstance()메소드를 호출하지 않으면
		//싱글톤 객체를 생성하지 않는다
		
		
		//인스턴스를 생성한 적이 없을 때만 객체 생성
		if( instance == null ) {

			try {
				instance = new Singleton_03(); //싱글톤 객체 생성
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		//싱글톤 객체 반환
		//	인스턴스를 생성한 것이 있으면 기존의 인스턴스 반환
		return instance;
	}
	
}







