package java06_class.etc;

public class StringCompare {

	public static void main(String[] args) {
		// ���ڿ� ��
		
		//���ͷ� ��� ���·�
		String str1 = "Apple";
		if( str1 == "Apple") {
			System.out.println("���");
		} else {
			System.out.println("X");
		}
		
		//--------------------------------
		
		System.out.println("----------");
		//��ü����(�ν��Ͻ�) �������
		String str2 = new String("Banana");
		System.out.println("[TEST] str2: "+str2);
		
		if( str2 == "Banana"){
			System.out.println("�ٳ���");
		} else {
			System.out.println("X");
		}
		
		//----------------------------------
		//** ���ڿ��� ���� ������ == �����ڸ� ����ϸ� �ȵȴ�
		//----------------------------------
		//** ���ڿ��� ���� �� equals() �޼ҵ带 �̿��ؾ� �Ѵ�
		//	equals()�� �� ���ڿ��� ������ true, �ٸ��� false ��ȯ
		
		// 	���ڿ�.equals(���ڿ�)
		System.out.println("----------");
		if(str2.equals("Banana")) {}
		if("Banana".equals(str2)) {
			System.out.println("�ٳ���");
		} else {
			System.out.println("X");
		}

	}

}
