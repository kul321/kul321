package java04_control.condition;

public class IfElseIfElse {
	public static void main(String[] args) {
		
		//if ~ else if ~ else
		
//		if( ���ǽ�1 ) {
//			���ǽ�1�� ���� �� �����ϴ� ����
//		} else if ( ���ǽ�2 ) {
//			���ǽ�1�� �ϴ� �����̰�
//			���ǽ�2�� ���� �� �����ϴ� ����
//		} else { ��� ������ �� �����ϴ� ����
//		}
//			
//		}
		
		//**else ������ ���������� �� �� �ִ�
		//**else, else if�� �ʼ� �ƴ�(��� ��)
		//**if�� ���� else, else if�� ����� �� ����
		
		//--------------------------------------------
		
		int num = 7;
		
		if ( num == 10 ) {
			System.out.println("10�Դϴ�");
			} else if ( num == 20 ) {
				System.out.println("20�Դϴ�");
			} else if ( num == 30 ) {
				System.out.println("30�Դϴ�");
			} else {
				System.out.println("��� �ƴմϴ�");
			}
				
	}

}
