package java04_control.loopQuiz;

import java.util.Scanner;

public class Quiz1 {//메인 메소드 - 프로그램의 시작
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 단은 반복되지 않고 입력받은 수로
		//반복되는 변수곱
		int dan;
		int i;
		System.out.println("2~9 사이의 숫자 입력: ");

		dan = sc.nextInt();

			if (dan>=2 && dan<=9) {
		
				for(i=1; i<10; i++) {
					System.out.println(dan + " x "+ i + " = "+(dan * i));
				}
		
			} else {
				System.out.println("입력값 오류");
		}
		sc.close();
	}	//메인 메소드 끝
}//클래스 정의 끝