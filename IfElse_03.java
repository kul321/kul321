package java04_control.condition;

public class IfElse_03 {
	public static void main (String[] args) {
		
		int num = 88;
		
		if ( num>0 && num<=100 ) {
			System.out.println("1~100 ������ ����");
		}
		
		System.out.println("-------------------");
		
		
		// ** �鿩���� �ڵ� ���� ����Ű ctrl + i
		//( ������ �ڵ�麸�� �� �ķ� �� �� �� �����ؼ� �����Ѵ�)
		
		// ctrl +a ��ü �ڵ� ����
		// ctrl +i �鿩���� ����
		// ctrl + shift + f�� ���� �� ��! ������� �� �� �����ع���
		if ( num>0 ) { //���, positive number
			System.out.println("0���� ũ��");
			
			if(num<=100) {
				System.out.println("0���� ũ��");
				System.out.println("100���� �۰ų� ����");
			}
		} else { //�ܼ��ϰ� �ݴ� ���� �ƴ�! ����� �ƴ�, 0, ����, num<=0
			 	System.out.println("0���� ũ�� �ʴ�");
			 	
			 	
			if (num == 0) {
				System.out.println("0�̴�");
				
			} else {
				System.out.println("0�� �ƴϴ�");
				System.out.println("0���� �۴�");
				
			}
		}
		
	}

}
