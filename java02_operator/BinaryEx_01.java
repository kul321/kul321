package java02_operator;

public class BinaryEx_01 {
	public static void main(String[] args) {
		//���׿����� - ���
		// + - * / %(������)
		
		int num1 = 17, num2 = 4;
		
		int result; //��� ���� ����
		
		result = num1 + num2;
		result = 17 + 4; //���� Ȱ��
		result = 21; //���� ����
		
		System.out.println("���� ��� : " + result);
		System.out.println(num1 + "�� " + num2 + "�� �հ� : " + result);
		
		System.out.println("-------------------");
	
		//%
		//	������ ������
		// moular operator
		//	mod ������
		
		result = num1 % num2; //num1�� num2�� ���� ������
		//result = 17 % 4
	
		System.out.println("������ ���� ��� : " + result);
		
		//-----------------------------------------------
		
		System.out.println("--- ��� ������ ---");
		System.out.println("num1 + num2 = " + num1 + num2);//���ڿ� ������
		
		System.out.println("num1 + num2 = " + (num1 + num2));//��ȣ �켱
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));//4.25�� �ƴ϶� 4�� ����
		System.out.println("num1 % num2 = " + (num1 % num2));
		
		//��������� �ݵ�� �ǿ����ڵ��� ���� ������Ÿ���� �� ���� �����ϴ�
		//��������� ����� �ǿ������� ������Ÿ������ ���´�
		
		System.out.println( "-------------------");
		System.out.println( 17 / 4); //int/int ->int�� ����
		System.out.println( 17.0 / 4.0); //double/double -> double�� ����
		System.out.println( (double)num1 / (double)num2); //����ȯ���ִ� ������ �̿�
		System.out.println( (double)17 / (double)4); //���� Ȱ��
		System.out.println( 17.0 / 4.0 ); //����ȯ
		System.out.println( 4.25 ); //double / double ����
		
		System.out.println("--------------------");
		
		double d = 3.14;
		System.out.println("d/2 - " + (d/2));
		System.out.println("d/2 - " + (d%2));
		
		
		
		
	
	}
}
