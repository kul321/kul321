package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_01 {
	
//	 + �ﰢ������ ���ϱ�
//	  - �ﰢ������ = (�غ� * ����)/2
//	  - �غ��� ���̸� �Է¹޾� ���
	
	public static void main(String[] args) {
		
		//1. �ʿ��� ���� ���� ( +������Ÿ�� )

		//�ʿ��� ������ : �غ�, ����
		int base; //�غ�
		int height; //����
		
		//�ʿ��� ��ü : Scanner
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		//����� �Ϸ�� �� : ����
		double area; //����
		
		
		//2. ������ �Է� ( �غ�, ���� )
		System.out.print("�غ��� ���̸� �Է��ϼ��� : ");
		base = sc.nextInt();
		
		System.out.print("������ ���̸� �Է��ϼ��� : ");
		height = sc.nextInt();
		
//		System.out.println("[TEST] base : " + base);
//		System.out.println("[TEST] height : " + height);
		
		
		//3. ������ �־�� ��� ( ���� )
		area = base * height / (double)2;
		
//		System.out.println("[TEST] area : " + area);
		
		
		//4. ��� ���
		System.out.println("�غ�: " + base
				+ ", ����: " + height
				+ "�� �ﰢ���� ���̴� " + area + "�Դϴ�");

		System.out.print("�غ�: " + base);
		System.out.print(", ����: " + height);
		System.out.println("�� �ﰢ���� ���̴� " + area + "�Դϴ�");

		System.out.println("�ﰢ���� ���� : " + (base*height)/(double)2 );

	}
	
}






