package java04_control.loopQuiz;

import java.util.Scanner;

public class Quiz1 {//���� �޼ҵ� - ���α׷��� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� �ݺ����� �ʰ� �Է¹��� ����
		//�ݺ��Ǵ� ������
		int dan;
		int i;
		System.out.println("2~9 ������ ���� �Է�: ");

		dan = sc.nextInt();

			if (dan>=2 && dan<=9) {
		
				for(i=1; i<10; i++) {
					System.out.println(dan + " x "+ i + " = "+(dan * i));
				}
		
			} else {
				System.out.println("�Է°� ����");
		}
		sc.close();
	}	//���� �޼ҵ� ��
}//Ŭ���� ���� ��