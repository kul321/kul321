package java03_scanner;

import java.util.Scanner;

public class ScannerEx_03 {
	public static void main(String[] args) {
		
		//Scanner�� �̿��� char �Է�
		//	Scanner���� char�� �Է¹޴� ����� ����
		
		//	String�� char���� ���� �� ��Ƴ��� Ÿ���̴�
		//	String���� �Է¹ް� �� �߿��� �� ����(����)�� ����� -> char
		
		//-----------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine(); //���ڿ��� �Է¹޾� str��ü�� ����
		
		//�Է��� ���ڿ� Ȯ�� �׽�Ʈ
		System.out.println("[TEST] str : " + str);
		
		//str���ڿ��� 0��° �ε��� ���ڸ� ch ������ ����
		char ch = str.charAt(0);
		
		//������ ���� ���� Ȯ�� �׽�Ʈ
		System.out.println("[TEST] ch : " + ch);
		
		//-----------------------------------------------------------------
		System.out.println("----------");
		System.out.print("���� �Է� : ");
		String genderString = sc.nextLine();
		char gender = genderString.charAt(0);
		
		System.out.println("�Է��� ���� : " + gender);
		
		
//		char gender = sc.nextLine().charAt(0);
		
		
	}
}








