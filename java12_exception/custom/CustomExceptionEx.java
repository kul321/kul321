package java12_exception.custom;

public class CustomExceptionEx {
	public static void main(String[] args) {
		User user = new User();
		try {
			//user.setAge( -9 );//���� �߻�
			user.setAge( 22 );//���� �߻� ���� ���� -�����帧
		} catch(UserAgeException e) {
			e.printStackTrace();
		}
	}
}
