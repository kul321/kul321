package java06_class.field;

public class MemberField_03 {
	//--- ��� �ʵ� ---
	private int num1 = 777; //�ν��Ͻ� ����
	private static int num2 = 888; //Ŭ���� ����
	//-----------------
	
	//�Ϲ� �޼ҵ�
	public void method(int param) {//param ->�Ű�����, ��������
		System.out.println(num1);
		System.out.println(num2);
		//-------------------------------
		
		int num1 = 101; //��������
		int num2 = 202; //��������
		
		System.out.println(num1);
		System.out.println(num2);
		
		//-------------------------------
		System.out.println(this.num1); //����ʵ�
		System.out.println(this.num2); //����ʵ�
		
		//���� ����ʵ�� ������ ������� ����ϴ� ���� ����
		System.out.println(MemberField_03.num2);//���� ����ʵ�
	}
}
