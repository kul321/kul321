package java12_exception.custom;

//Exception Ŭ���� ��ӹޱ� -> Checked Exception Ŭ���� �����
//public class UserAgeException extends Exception {

//RuntimeException Ŭ���� ��ҹޱ� -> Unchecked Exception Ŭ���� �����
public class UserAgeException extends RuntimeException{
	
	@Override
	public String getMessage() {//���� �޽���(�߻� ����)�� ��ȯ�ϴ� �޼ҵ�
		return "���̴� 0���� �۰ų� 150���� Ŭ �� ����";
	}
}


//RuntimeException Ŭ���� ��ӹޱ� -> Unchecked Exception Ŭ���� �����
//public class UserAgeException extends RuntimeException {
//}
