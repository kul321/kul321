package java04_control.condition;

import java.util.Scanner;

public class IfElse_02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		//�Է��� ���ڰ� Ȧ��/¦�� �Ǻ��ϴ� �ڵ� �ۼ�
		
		if (num%2 == 0) {//¦��, even number -> 2�� ������ �������� ��
			System.out.println("num["+num+"] - ¦��");
		}	else {
			System.out.println("num["+num+"] - Ȧ��");
		}
				
		
		
	}
}
