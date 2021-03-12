package java02_operator;

public class BinaryEx_03 {
	public static void main(String[] args) {
		
		//���׿����� - ����, ��
		
		// < less than, lt
		// > greater than, gt
		// <= less than equal, le
		// >= greater than equal, ge
		// == equal, eq
		// != not equal, ne
		
		// ���� �ǿ����ڿ� ������ �ǿ����ڸ� ���Ͽ�
		// ����� ��/�������� ��ȯ�Ѵ�( booleanŸ������)
		
		// true / false ��ȯ�Ѵ�
		
		//--------------------------------------------------
		
		int num1 = 10;
		int num2 = 20;
		
		System.out.println( "num1==num2 : " + (num1==num2)); //false
		System.out.println( "num1!=num2 : " + (num1!=num2)); //true
		
		System.out.println( "num1<num2 : " + (num1<num2)); //true
		System.out.println( "num1>num2 : " + (num1>num2)); //false
		
		System.out.println( "num1<=num2 : " + (num1<=num2)); //true
		System.out.println( "num1>=num2 : " + (num1>=num2)); //false
		
		//------------------------------------------------------
		
		boolean result = num1 == num2;
		System.out.println("��� : " + result);
		
		//���׿�����
		// &&		||		!
		//  AND     OR		NOT
		
		// ! �����ڴ� ���� ������
		// |, vertical bar, ���� �� (shift + \)
		
		// ���� Ÿ��(boolean) �������� ���踦 ������ ����� �������� ������
		
		// And ������ �ǿ����� ��� true �� �� ����� true
		// OR ������ �ǿ����� �� �ϳ��� true �� �� ����� true
		// NOT ������ �ǿ����ڸ� ����(�ݴ�� �ٲ�)
		
		//--------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true&&false : " + (b1&&b2)); //false
		System.out.println("treu||false : " + (b1||b2)); //true
		//-----------------------------------------------------
		
		System.out.println("-----------------------");
		
		int num = 88;
		
		System.out.println(num >= 1 ); //true
		System.out.println(num <= 100 ); //true
		
		System.out.println(num >=1 && num <= 100);
		//-----------------------------------------------------
//		System.out.println( 1<= num < 100); 
		//���� �߸� �ȵǴ� ����: �Ҹ� ���� ��Ʈ ���� �� �����ϴ� ����
		//���� �ȵǱ� ����
		
		//-------------------------------------------------
		
		System.out.println("!true : " + !true);
		System.out.println("false : " + !false);
		
		//---------------------------------------------------
		System.out.println("-----------------------");
		
		System.out.println( !( (num>=1) && (num<=100)  ) );
		
		System.out.println( num<1 || num>100);
		
	}

}
