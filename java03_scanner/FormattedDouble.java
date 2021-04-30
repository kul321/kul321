package java03_scanner;

public class FormattedDouble {
	public static void main(String[] args) {
		
		//�Ҽ��� ��°�ڸ����� �ݿø��Ͽ� ���
		
		//���1.
		//	System.out.printf() �� ����Ѵ�
		//	printf - print formatted
		
		//	���Ĺ��ڸ� �̿��Ͽ� ��µǴ� ���ڿ��� ������ �����Ѵ�
		
		//	���Ĺ��ڴ� % ��ȣ�� ������ ��Ÿ���� ���ڸ� ���ļ� ����Ѵ�
		//	%d(10��������) %f(�Ǽ�) %s(���ڿ�) %c(���Ϲ���)
		
		System.out.printf("%d", 123); //���Ĺ��� %d �ڸ��� 123�� ���� ��µ�
		System.out.println();
		
		//5���ڰ� �� �ڸ��� Ȯ���ϰ� ������ 123�� �� �ڸ��� �־ ����Ѵ�
		System.out.printf("%5d", 123);
		System.out.println();
		
		System.out.printf("%5s%5s%5s", "kor", "eng", "math");
		System.out.println();
		System.out.printf("%5d%5d%5d", 100, 99, 98);
		System.out.println();
		
		//�Ҽ��� ��°�ڸ����� ��µǵ��� �Ѵ� - %.2f
		System.out.printf("%.2f", 123.5456);
		System.out.println();
		
		//���� ����
		System.out.printf("%c", 'A');
		System.out.println();
		
		//------------------------------------------------------------
	
		//���2.
		//	String.format("���Ĺ������Թ��ڿ�", ������, ...)
		//	��� ���ڿ��� �����Ѵ�
		
		String str = String.format("%7.2f", 123.45678);
		
		System.out.println("1234567890");
		System.out.println(str);
		
		System.out.println(String.format("%3d��", 25));
		
		//------------------------------------------------------------
		
		//���3.
		//	������ ������� �Ҽ������� �ڸ��� �����ϱ�
		
		//	123.45678
		//		-- x100 --> 12345.67
		//		-- �Ҽ��� �ݿø� --> 12346
		//		-- /100 --> 123.46
		
		double avg = 34.56789;
		
		//100�� ���ϰ� ������ ���� -> 10�� 2����(10^2) -> �Ҽ��� 2�ڸ� �̵�
		double result = Math.round( avg*100 ) / (double)100;
		System.out.println(result);
		
		//** Math.round(�Ǽ�)
		//	�־��� �Ǽ��� �Ҽ��κ��� �ݿø��ؼ� ��ȯ�Ѵ�
		
		//	avg						-> 34.56789
		//	avg*100					-> 3456.789
		//	Math.round( avg*100 )	-> 3457
		//	Math.round( avg*100 ) / (double)100	-> 34.57
		
		
		
		String dStr = "123.46";
		double dVal = Double.valueOf( dStr );
		
		
		double average = 56.7891124;
		String s = String.format("%.2f", average);
		double res = Double.valueOf( s );
		
		
	}
}














