package java05_array;

public class Array_05 {

	public static void main(String[] args) {
		// ���ڿ�
		String str = "Apple";
		//-------------------------------
		String[] strArr; //���ڿ� �迭 ����
		strArr = new String[3]; //�迭 ����
		//�迭�� �� ����
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
		System.out.println("�迭�� ����, ���ڿ� ����: " + strArr.length);
		System.out.println("=======================");
		
		for(int i=0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println("���ڿ��� ����: "+strArr[i].length());
			System.out.println("-------------------");
		}


	}

}
