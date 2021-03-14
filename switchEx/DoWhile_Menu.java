package java04_control.switchEx;

import java.util.Scanner;

public class DoWhile_Menu {
//	- 메뉴 만들기
//
//	===============================
//		M  e  n  u
//	===============================
//		1. Hello World 출력
//		2. 이름 출력
//		3. 성별 출력
//		4. 종료
//	===============================
//
//	  >> _
//
//	 -> 각 메뉴를 입력하면 메뉴에 알맞게 동작하도록 작성

	public static void main(String[] args) { //main() method end
		Scanner sc = new Scanner(System.in);
		
		final int HELLO_MENU = 1;
		final int NAME_MENU = 2;
		final int GENDER_MENU = 3;
		final int EXIT_MENU = 4;
		int select;
		do {
			System.out.println("===============================");
			System.out.println("\tM  e  n  u");
			System.out.println("===============================");
			System.out.println("\t1.Hello World 출력    ");
			System.out.println("\t2.이름 출력           ");
			System.out.println("\t3.성별 출력           ");
			System.out.println("\t4.종료                ");
			System.out.println("===============================");//메뉴판
			System.out.print("\t>>");
			
			//try-catch구문, 나중에 "예외처리" 파트에서 배움
			//	숫자가 아닌 
			try {
			select = sc.nextInt();//메뉴 선택
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요!");
				select = EXIT_MENU;
			}
			
			switch (select){
			case HELLO_MENU:
				System.out.println("Hello wolrd");//1. 헬로월드
				break;
			case NAME_MENU :
				System.out.println("내 이름은 민서");//2. 이름 출력
				break;
			case GENDER_MENU:
				System.out.println("나는 여자다");//3. 성별 출력
				break;
			case EXIT_MENU:
				System.out.println("종료하겠습니다");//4. 종료 출력
				break;
			default :
				System.out.println("메뉴를 잘못 선택하셨습니다");//에러 출력
			}
		} while( select != EXIT_MENU);
		
		sc.close();
		
		
	}// main() method end
}
