package java09_api;

import java.util.Random;
import java.util.Scanner;

public class Baskin31QuizM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		boolean bool = true;
		int win = 0; // 승리체크용
		int lose = 0; // 패배체크용

		while (bool) {
			System.out.println(" === 베스킨 라빈스31 Game === ");
			System.out.println("1. 게임시작");
			System.out.println("2. 게임점수");
			System.out.println("3. 게임끝");
			System.out.print("선택 > ");
			int sel = sc.nextInt();
			switch (sel) {
			case 1:
				// 실제 게임 로직 작성
				System.out.println("<<< 시작~! >>>");
				int count = 0;
				while (true) {
					System.out.println("<< 당신의 턴 >>");
					System.out.print("숫자를 입력하세요(1~3) : ");
					int uNum = sc.nextInt();
					for (int i = 0; i < uNum; i++) {
						count++;
						System.out.println((count) + "!");
						if (count == 31) {
							System.out.println("당신이 졌습니다");
							lose++;
							break;
						}
					}
					//내 차례에 count=1 -> break를 타고나오면 for문만 빠져나옴
					//따라서 컴퓨터 turn도 진행됨 
					//여기서 한번더 while문을 나가는 break를 걸어줌 
					
					if (count >= 31) {
						break;
					}
					System.out.println("<< 컴퓨터 턴 >>");
					int cNum = r.nextInt(3) + 1;
					for (int i = 0; i < cNum; i++) {
						count++;
						System.out.println((count) + "!");
						if (count == 31) {
							System.out.println("당신이 이겼습니다");
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
				// 맞춘 횟수 출력후 선택화면으로
				System.out.println("<< 전적 >>");
				System.out.println(" 승리 : "+win);
				System.out.println(" 패배 : "+ lose);
				break;
			case 3:
				bool = false;
				break;
			}
		}
	}


}
