package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_01 {
//	 + ���� �ϳ��� �Է¹޾� ������� �������� �Ǻ��Ͻÿ�
//		>> Input Number : -3
//		>> �����Դϴ�
	
	
//
//	 + �Է��� �����Ͱ� 3�� ������� �Ǻ��Ͻÿ�
//	  (% ������ ���)
//		>> Input Number : 7
//		>> 3�� ����� �ƴմϴ�
//
//	 + �� ���� �Է� �޾� ū ���� ����Ͻÿ�
//		>> Input Number1 : 44
//		>> Input Number2 : 88
//		>> 88 �� �� ū ��
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//-----------------Q1--------------------------------
		System.out.println(" Q1.���ڸ� �Է��Ͻÿ� : ");//����
		int num1 = sc.nextInt();
		
		if ( num1 > 0) {	  //���
			System.out.println("=>����["+num1+"]��/�� ���");
		} else if( num1 <0) { //����
			System.out.println("=>����["+num1+"]��/�� ����");
		} else 				  //0
			System.out.println("=>����["+num1+"]��/�� 0");
		
		//------------------Q2--------------------------------
		System.out.println("\n Q2.���ڸ� �Է��Ͻÿ� : ");//����
		int num2 = sc.nextInt();
		
		if ( num2%3 == 0) {
			System.out.println("=>����["+num2+"]��/�� 3�� ���");
		} else {
			System.out.println("=>����["+num2+"]��/�� 3�� ����� �ƴ�");
		}
		
		//------------------Q3----------------------------------
		System.out.println("\n Q3.ù ��° ���ڸ� �Է��Ͻÿ� : \n");//����
		
		int num3 = sc.nextInt();
		System.out.println(" �� ��° ���ڸ� �Է��Ͻÿ� : ");//����
		int num4 = sc.nextInt();
		
		if (num3 > num4) {
			System.out.println("=>ù ��° ����["+num3+"]��/�� �� ��° ����["+num4+"]���� ũ��");
		} else if ( num4>num3 ) {
			System.out.println("=>�� ��° ����["+num4+"]��/�� ù ��° ����["+num3+"]���� ũ��");
		} else
			System.out.println("=>�� ���� ũ�Ⱑ ����");
		
	}

}
