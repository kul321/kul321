package java03_scanner;

import java.util.Scanner;

//java.lang ��Ű���� Ŭ������ import���� Ŭ���������� ��� ����
//import java.lang.String;

public class ScannerEx_02 {
	public static void main(String[] args) {
		
		//import ����ȭ ����Ű
		//	ctrl + shift + o
		
		//------------------------------------------------------
		
		//���ڿ� �Է¹ޱ�
		
		//1. �Է°�ü ���� ���� (java.util.Scanner)
		Scanner in;
		
		//2. �Է°�ü ���� (new)
		in = new Scanner(System.in);
		
		//3. ���ڿ� �Է¹ޱ� (String)
//		System.out.println("���ڿ��� �Է��ϼ��� : ");
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		String str = in.nextLine();
		
		//4. �Է¹��� ���ڿ� ����ϱ�
		System.out.println("�Է��� ���� : " + str);
		
	}
}



