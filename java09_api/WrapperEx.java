package java09_api;

public class WrapperEx {
	public static void main(String[] args) {
		int i1 = 10; // intŸ�Ժ���, (�⺻��)
		
		Integer iVal1 = new Integer( 20 ); //�ڽ�, Boxing
		Integer iVal2 = new Integer( i1 );
		Integer iVal3 = new Integer( "30" );
		
		System.out.println(iVal1);
		System.out.println(iVal2);
		System.out.println(iVal3);
		
		System.out.println("---------------");
		
		int i2 = iVal2.intValue(); //��ڽ�, Unboxing
		System.out.println("---------------");
		
		//���� �ڽ�, Auto Boxing
		Integer iVal4 = 1234;
		Double dVal1 = 543.5475;
		
		//���� ��ڽ�, Auto Unboxing
		int i4 = iVal4;
		double d1 = dVal1;
		System.out.println("---------------");
		
		//�ڷ����� ���� ����
		System.out.println("BYTES : "+ Integer.BYTES); //4b
		System.out.println("SIZE : "+ Integer.SIZE); //32 bit
		System.out.println("MIN_VALUE : "+ Integer.MIN_VALUE);//�ּҰ�
		System.out.println("MAX_VALUE : "+ Integer.MAX_VALUE);//�ִ밪
		
		System.out.println("---------------");
		
		//���ڿ� �Ľ�
		//  **parse - �����ϴ�
		
		// ���ڿ����� ���ϴ� ������ �����͸� �����ϴ� ��
		
		int num1 = Integer.parseInt("1234");
		System.out.println(num1);
		
		//java.lang.NumberFormatException �߻�
		//	�Ľ��Ϸ��� ���ڿ��� ��������(NumberFormat)�� �ƴ� �� �߻�
//		int num2 = Integer.parseInt("123ABC");//����
		
		double d = Double.parseDouble("3.14");
		System.out.println( d );
		
		//-----------------------------------------------------
		
		//parseBoolean�� "true"�� �Ľ��ϰ� �׷��� ������ ��� false
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Boolean.parseBoolean("false"));
		System.out.println(Boolean.parseBoolean("123"));
		System.out.println(Boolean.parseBoolean("abc"));
		
		
	}
}
