package java06_class;

public class Main_02 {

	public static void main(String[] args) {
		
		
//		int�� �⺻�� - 0
//		double�� �⺻�� - 0.0
//		boolean�� �⺻�� -false
//		char�� �⺻�� - '\0'(null����)
//		������ �⺻�� - null
//		** null�� �ǹ�: ��������� ����
		
		//-----------------------------
		
		Class_02 cl = null; // ��ü ���� ����
		cl = new Class_02(); //��ü ����, �ν��Ͻ�ȭ
		
		//��� �ʵ尪 ���
		System.out.println(cl.num4); //public
		System.out.println(cl.num3); //protected
		System.out.println(cl.num2); //default
		
//		System.out.println(cl.num1); //private, ����
		
		

	}

}
