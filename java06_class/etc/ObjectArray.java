package java06_class.etc;

public class ObjectArray {
	public static void main(String[] args) {
		//��ü �迭
		
		Student st = new Student("Alice", 50);
		
		//-------------------------------------
		
		Student[] stuArr; //StringŸ���� �迭 ���� ����
		
		stuArr = new Student[3]; //StudentŸ������ �迭�� ����
		
//		stuArr[0].setName("Alice); //NullPointerException�߻�
//		stuArr[0] = new Student("Bob",22); //��ü ������ �ʿ��ϴ�
		
		//------------------------------------------
		
		for (int i = 0; i < stuArr.length; i++) {
			stuArr[i] = new Student();
			
			
		}
		
		
		//-------------------------------------
//		�ƴϸ� ������ ����
//		stuArr[0] = new Student("Alice", 11);
//		stuArr[1] = new Student("Bob", 11);
//		stuArr[2] = new Student("Clare", 11);
		
		
		
	}

}
