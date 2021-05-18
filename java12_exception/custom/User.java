package java12_exception.custom;

public class User {
	private int age;//����

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws UserAgeException{
		//���̰� 0���� �۰ų� 150���� ū �椷
		//	->���������� ���� ��Ȳ���� ������ -> ���� ��Ȳ
		if( age<0 || age>150) {
			System.out.println("ERROR 0~150 ���̷� �Է��ϼ���");
			throw new UserAgeException();
			
		}
		this.age = age;
	}
	
}
