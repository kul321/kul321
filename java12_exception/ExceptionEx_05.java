package java12_exception;

class ThrowsTest {
	public void method() throws Exception {
		
		//CheckedException -> �ݵ�� ����ó���ؾ� ��
		throw new Exception();
		
	}
}


public class ExceptionEx_05 {
	public static void main(String[] args) {
		
		ThrowsTest tt = new ThrowsTest();
		
		try {
			//����ó���� ���ѱ� �޼ҵ� ȣ�� -> ����ó���� �����
			tt.method();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
