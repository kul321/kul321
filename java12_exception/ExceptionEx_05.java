package java12_exception;

class ThrowsTest {
	public void method() throws Exception {
		
		//CheckedException -> 반드시 예외처리해야 함
		throw new Exception();
		
	}
}


public class ExceptionEx_05 {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		try {
			//예외처리를 떠넘긴 메소드 호출 -> 예외처리를 대신함
			tt.method();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
