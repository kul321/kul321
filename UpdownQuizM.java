package java09_api.quiz;

import java.util.Random;
import java.util.Scanner;

public class UpdownQuizM {
	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int com = ran.nextInt(50)+1;//com�� 1~50 ���� ����
		int user;
		do{ 
			System.out.println("~Up&down ���� ����!~ 1~50 ������ ���ڸ� �Է��ϼ��� :");
			user = sc.nextInt();
		} while ( user <1 || user >50);
		
		for (int i = 0; i < 7; i++) {
			if(user == com) {
				System.out.println("������ϴ�");
				return;
			} else if(user > com) {
				System.out.println("Down");
				user = sc.nextInt();
				
			} else {
				System.out.println("Up");
				user = sc.nextInt();
			}
			
		}System.out.println("�й��߽��ϴ�");
		System.out.println("������ "+com);
	}

}
