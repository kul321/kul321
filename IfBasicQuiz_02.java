package java04_control.condition;

import java.util.Scanner;

public class IfBasicQuiz_02 {
//	 + �� ���� �Է� �޾� ���� ū ���� ����Ͻÿ�
//
//	 + �� ���� �Է� �޾� ���� ¦���̰�
//	  3�� ������� �Ǻ��Ͻÿ�
//
//	 + �� ������ ������ �Է� �޾� �հ�� ����� ���ϰ�
//	  ����� 90�̻��̸� "A", 80�̻��̸� "B",
//	  70 �̻��̸� "C", 60 �̻��̸� "D",
//	  60�̸��̸� "F" �� ����Ͻÿ�.
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//------------------Q1----------------------
		System.out.println("Q1. �� ���� ���ڸ� �Է��ϼ���");
		System.out.print("ù ��° ����: ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num2 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num3 = sc.nextInt();
		
		if ( num1 >= num2 && num1 >= num3) {
			System.out.println("���� ū ���� "+num1+"�Դϴ�");
			} else if ( num2 >= num1 && num1 >= num3) {
				System.out.println("���� ū ���� "+num2+"�Դϴ�");
			} else {
				System.out.println("���� ū ���� "+num3+"�Դϴ�");
			}
		System.out.println("-------------------------------\n");
		//------------------Q2-----------------------
		System.out.println("Q2. �� ���� ���ڸ� �Է��ϼ���");
		System.out.print("ù ��° ����: ");
		int num4 = sc.nextInt();
		System.out.print("�� ��° ����: ");
		int num5 = sc.nextInt();
		
		if ((num4 + num5)%2 == 0) {
			 if ((num4+num5)%3 == 0) {
				 System.out.println("�� ������ ���� ¦���̰� 3�� ����Դϴ�");
			 } else
				 System.out.println("�� ������ ���� ¦�������� 3�� ����� �ƴմϴ�");
		} else {
			if ((num4+num5)%3 == 0) {
				System.out.println("�� ������ ���� ¦���� �ƴ����� 3�� ����Դϴ�");
			} else
				System.out.println("�� ������ ���� ¦���� �ƴϰ� 3�� ����� �ƴմϴ�");
		}
		System.out.println("-------------------------------\n");
		//--------------------Q3-------------------------
		System.out.println("Q3. �� ������ ������ �Է��ϼ���");
		System.out.print("����1�� ����: ");
		int sub1 = sc.nextInt();
		System.out.print("����2�� ����: ");
		int sub2 = sc.nextInt();
		System.out.print("����3�� ����: ");
		int sub3 = sc.nextInt();
		
		int sum = sub1+sub2+sub3;
		double avg = sum/(double)3;
			
		if(avg>=0 && avg<=100) {
			if (avg >= 90) {
				System.out.print("��� �� ");
				System.out.printf("%.2f", avg);
				System.out.print("������ A�����Դϴ�");
				}
				else if (avg >= 80) {
					System.out.print("��� �� ");
					System.out.printf("%.2f", avg);
					System.out.print("������ B�����Դϴ�");
				}
				else if (avg >= 70) {
					System.out.print("��� �� ");
					System.out.printf("%.2f", avg);
					System.out.print("������ C�����Դϴ�");
				}
				else if (avg >= 60) {
					System.out.print("��� �� ");
					System.out.printf("%.2f", avg);
					System.out.print("������ D�����Դϴ�");
				} else {
					System.out.print("��� �� ");
					System.out.printf("%.2f", avg);
					System.out.print("������ F�����Դϴ�");
				}
			}	else {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�");
			}
		
		
		//1�� ���� 2�� ���� max sum ���� ������ ������ �����غ���
		//2�� ���� sum%2 ==0 && sum%3==0
		//2�� ���� if (sum%6==0){<- �̷������� ������� �̿��ϴ� ���
	}
}