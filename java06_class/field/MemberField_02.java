package java06_class.field;

public class MemberField_02 {
	
	//����ʵ�->�ν��Ͻ� ����
	//	private int num; 
	//����ʵ�-> Ŭ���� ����, ���� ����, static ����
	public static String city = "Seoul";

	
	
	//--------------------------------------
	private int data1; //�ν��Ͻ� ����
	
	//���� �޼ҵ�
	public static void test() {
//		System.out.println( data1);//����
	}
	//�����޼ҵ忡�� �ν��Ͻ� ���� ��� �Ұ�
	// -> �ν��Ͻ� ������ ������ �����ϱ� ���� �����غ� �Ϸ�Ǿ�� �Ѵ�

	//------------------------------------
	
	private static int data2; //���� ����
	
	public static void setData2(int data2) {
		MemberField_02.data2 = data2;
	}
	
	public static int getData2() {
		return data2;
	}
	
	//�����޼ҵ忡���� ��������ʵ常 ����� �� �ִ�
	
	//----------------------------------------------
	private static int data3; //���� ����
	public void test2() {//�Ϲ� ����޼ҵ�
		System.out.println(data3);
	}
	//�Ϲ� �޼ҵ忡�� ���������� ����ϴ� ���� ������ ����
}
