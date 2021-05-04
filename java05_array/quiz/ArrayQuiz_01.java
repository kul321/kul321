package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuiz_01 {
	public static void main(String[] args) {
		
		//---��� ����---
		//	�������� ���Ǵ� ��
		//	���� ���Ǵ� ��
		
		final int FLOOR =5; //�ǹ��� �� ��
		final int FEE = 12000; //�δ� ������
		
		//---���� ���� ---
		int[] people = new int[FLOOR+1];//�� �� �ο� + �� �ο�
		int[] expense = new int[FLOOR+1];//�� �� ������ + �� ������
		
		Scanner sc = new Scanner(System.in);
		//----------------
		
		//--- �� ���� �ο� �Է� ----
		System.out.println("- - - �� ���� �ο� �Է� - - -");
		for(int i=0; i<FLOOR; i++) {//i, 0 ~FLOOR-1
			System.out.print(">>"+ (i+1) + "���� �ο���?");
			people[i] = sc.nextInt();
			
			people[FLOOR] += people[i];//���ο� ���
		}
			//   =people[5]

//			//TEST : �ο� + ���ο� ��ü ���
//			for(int i=0; i<people.length; i++) {
//				System.out.println(people[i]);
//			}
			
		//-----������ ���-----
		//---------------------
		for(int i=0; i<expense.length; i++) {
			expense[i] = people[i] * FEE;
		}
		
//		//TEST : ������ + �Ѱ����� ��ü ���
//		for (int i = 0; i < expense.length; i++) {
//			System.out.println(expense[i]);
//		}
		
		//--- ������ ���----
		System.out.println();
		System.out.println("- - - �� ���� ������ ��� - - -");
		for(int i=0; i<FLOOR; i++) {
			System.out.println(">>" + (i+1)+"���� ������� " + expense[i] +"�� �Դϴ�");
		
		}
		System.out.println();
		System.out.println("�� �ο���" + people[FLOOR]+"�Դϴ�");
		System.out.println("�� �������" + expense[FLOOR] +"�Դϴ�");
			
			
		sc.close();
		
		

		//--------------------------
		
		
		
		
	}

}
