package java04_control.switchEx;

public class Switch_02 {
	public static void main(String[] args) {
		int num = 20;
		
		if (num==10) {
			System.out.println("num�� 10");
		} else if(num ==20) {
			System.out.println("num�� 20");	
		} else if(num ==30) {
			System.out.println("num�� 30");
		} else {
			System.out.println("num�� 10,20,30 �� �ƴ�");
		}
		
		System.out.println("------------------");
		
		switch (num) {
		case 10:
			System.out.println("num�� 10");
			break;
		case 20:
			System.out.println("num�� 20");
			break;
		case 30:
			System.out.println("num�� 30");
			break;
		default:
			System.out.println("num�� 10,20,30 �� �ƴ�");
		}
		
		System.out.println("----------------");
		
		int score = 88;
		if (score>=90) {
			System.out.println("A���");
		}
		
		//swith�� �����񱳸� �� �� ���� ->if�� ����Ѵ�
		//switch(score) {
		//case>=90: ����
//	}
	
	switch( score/10) { //score�� 10���� ���� ��, 10�� �ڸ� ����
	case 10:
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
		}
	}
}
