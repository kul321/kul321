package java03_scanner;

import java.util.Scanner;

public class ScannerEx_04 {
	public static void main(String[] args) {
		
		//���ڿ� �Է� ó�� �޼ҵ�(���)
		//	nextLine(), next()
		
		//----------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		String str1;
		String str2;
		
		System.out.print("Input String : ");
		
		//���ڿ� �Է� �ޱ�
		str1 = sc.nextLine();
		str2 = sc.nextLine();
//		str1 = sc.next();
//		str2 = sc.next();
		
		System.out.println("--- ��� ---");
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		
		//nextLine()
		//	���๮��(���Ͱ�)�� �������� �Է��� �� ���� �ϳ��� ���ڿ��� �Ǵ�
		
		//next()
		//	���鹮�ڸ� �������� �ϳ��� ���ڿ��� �Ǵ�
		
		//----------------------------------------------------

		System.out.println();
		
		System.out.print('\n');
		
		//----------------------------------------------------
		
		System.out.println("�ȳ�\t�ϼ���");
		
		System.out.print("�ȳ��ϼ���\n");
		
		System.out.print("�ȳ��ϼ���");
		System.out.println();
		
	}
}













