package java09_api.quiz;

import java.util.Random;
import java.util.Scanner;

public class UpdownQuizM {
	public static void main(String[] args) {
		Random ran = new Random();
		
		Scanner sc = new Scanner(System.in);
		
		int com = ran.nextInt(50)+1;//com이 1~50 랜덤 생성
		int user;
		do{ 
			System.out.println("~Up&down 게임 시작!~ 1~50 사이의 숫자를 입력하세요 :");
			user = sc.nextInt();
		} while ( user <1 || user >50);
		
		for (int i = 0; i < 7; i++) {
			if(user == com) {
				System.out.println("맞췄습니다");
				return;
			} else if(user > com) {
				System.out.println("Down");
				user = sc.nextInt();
				
			} else {
				System.out.println("Up");
				user = sc.nextInt();
			}
			
		}System.out.println("패배했습니다");
		System.out.println("정답은 "+com);
	}

}
