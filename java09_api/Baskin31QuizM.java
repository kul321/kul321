package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin31QuizM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		int win = 0; // �¸�üũ��
		int lose = 0; // �й�üũ��

		while (bool) {
			System.out.println(" === ����Ų ���31 Game === ");
			System.out.println("1. ���ӽ���");
			System.out.println("2. ��������");
			System.out.println("3. ���ӳ�");
			System.out.print("���� > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				// ���� ���� ���� �ۼ�
				System.out.println("<<< ����~! >>>");
				int count = 0;
				while (true) {
					System.out.println("<< ����� �� >>");
					System.out.print("���ڸ� �Է��ϼ���(1~3) : ");
					int uNum = sc.nextInt();
					for (int i = 0; i < uNum; i++) {
						count++;
						System.out.println((count) + "!");
						if (count == 31) {
							System.out.println("����� �����ϴ�");
							lose++;
							break;
						}
					}
					//�� ���ʿ� count=1 -> break�� Ÿ������ for���� ��������
					//���� ��ǻ�� turn�� ����� 
					//���⼭ �ѹ��� while���� ������ break�� �ɾ��� 
					
					if (count >= 31) {
						break;
					}
					System.out.println("<< ��ǻ�� �� >>");
					int cNum = r.nextInt(3) + 1;
					for (int i = 0; i < cNum; i++) {
						count++;
						System.out.println((count) + "!");
						if (count == 31) {
							System.out.println("����� �̰���ϴ�");
							win++;
							break;
						}
					}
					if (count >= 31) {
						break;
					}

				}
				break;

			case 2:
				// ���� Ƚ�� ����� ����ȭ������
				System.out.println("<< ���� >>");
				System.out.println(" �¸� : "+win);
				System.out.println(" �й� : "+ lose);
				break;
			case 3:
				bool = false;
				break;
			}
		}
	}


}
