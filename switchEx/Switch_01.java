package java04_control.switchEx;

public class Switch_01 {
	public static void main(String[] args) {
		//switch��, ���ù�
		//	switch-case��
//		switch (�񱳴��) {
//		
//		case ��:
//			
//		case ��:
//		
//		case ��:
//			
//			...
//		default:
//			
//		
//		}
		
		int num = 20;
		switch(num) {
		case 10:
			System.out.println("num�� 10�Դϴ�");
			break;
		case 20:
			System.out.println("num�� 20�Դϴ�");
			break;
		case 30:
			System.out.println("num�� 30�Դϴ�");
			break;
		default:
			System.out.println("num�� 10,20,30 ��� �ƴմϴ�");
			
		}
		// �񱳴���� ���� case�� ������ ���� ������
		// �ش� case������ ��ġ���� �ڵ尡 ����ȴ�
		// ->case������ �������� break; �ڵ带 ����Ѵ�
		
		// case�� ������ �� �߿��� ���� ���� ������ default:
		// default : ���� ����
	}

}
