package java04_control.switchEx;

public class Switch_03 {

	public static void main(String[] args) {
		
		//s����(boolean) �����͸� switch�� ����� �� ����
//		boolean b = true;
//		switch(b) {

		//-----------------------------------------
		//�Ǽ��� �����͵� ���������� switch�� ��� �Ұ�
		//double dVal = 322.435;
		//switch(dVal) {
		
		//-----------------------------------------
		//switch���� char�� ����ϱ�
		char alpha = 'B';//<-������ ó����
		switch (alpha){
		case 'A':
			System.out.println("A�̴�");
			break;
		case 'B':
			System.out.println("B�̴�");
			break;
		case 'C':
			System.out.println("C�̴�");
			break;
		default :
			System.out.println("�� �ƴ�");
			
		}
	}

}
