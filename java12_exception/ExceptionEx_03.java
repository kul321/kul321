package java12_exception;

public class ExceptionEx_03 {
	public static void main(String[] args) {
		
		try {
			//try���
			//���� �߻��� �����Ǵ� �ڵ带 �ۼ���
			
		} catch (NullPointerException e) {
			//NullPointerException �߻� �� ó���ϴ� �ڵ�
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//ArrayIndexOutOfBoundsException �߻� �� ó���ϴ� �ڵ�
		
		} catch (Exception e) {
			// NullPointerException ��
			// ArrayIndexOutOfBoundsException �� ������ ��� ���ܸ� ó����
			
		}
		
		// catch������ ���� �� �ۼ��� �� �ִ�
	
		//--------------------------------------------------
		
		//multi catch ����
		//	-> catch������ ����Ÿ���� �Ѳ����� ���� �� ���� ���
		
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			//NullPointerException ��
			//ArrayIndexOutOfBoundsException �� ���ÿ� ó���ϱ�
			
		} catch (Exception e) {
			//���� ���� ���� ó���ϱ�
			
		}
		
	}
}















