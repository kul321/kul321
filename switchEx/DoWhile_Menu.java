package java04_control.switchEx;

import java.util.Scanner;

public class DoWhile_Menu {
//	- �޴� �����
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World ���
//		2. �̸� ���
//		3. ���� ���
//		4. ����
//	===============================
//
//	  >> _
//
//	 -> �� �޴��� �Է��ϸ� �޴��� �˸°� �����ϵ��� �ۼ�

	public static void main(String[] args) { //main() method end
		Scanner sc = new Scanner(System.in);
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		int select;
		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1.Hello World ���    ");
			System.out.println("\t2.�̸� ���           ");
			System.out.println("\t3.���� ���           ");
			System.out.println("\t4.����                ");
			System.out.println("===============================");//�޴���
			System.out.print("\t>>");
			
			//try-catch����, ���߿� "����ó��" ��Ʈ���� ���
			//	���ڰ� �ƴ� 
			try {
			select = sc.nextInt();//�޴� ����
			} catch (Exception e) {
				System.out.println("���ڸ� �Է��ϼ���!");
				select = EXIT_MENU;
			}
			
			switch (select){
			case HELLO_MENU:
				System.out.println("Hello wolrd");//1. ��ο���
				break;
			case NAME_MENU :
				System.out.println("�� �̸��� �μ�");//2. �̸� ���
				break;
			case GENDER_MENU:
				System.out.println("���� ���ڴ�");//3. ���� ���
				break;
			case EXIT_MENU:
				System.out.println("�����ϰڽ��ϴ�");//4. ���� ���
				break;
			default :
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�");//���� ���
			}
		} while( select != EXIT_MENU);
		
		sc.close();
		
		
	}// main() method end
}
