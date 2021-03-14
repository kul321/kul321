package java04_control.switchEx;

public class Switch_02 {
	public static void main(String[] args) {
		int num = 20;
		
		if (num==10) {
			System.out.println("num은 10");
		} else if(num ==20) {
			System.out.println("num은 20");	
		} else if(num ==30) {
			System.out.println("num은 30");
		} else {
			System.out.println("num은 10,20,30 다 아님");
		}
		
		System.out.println("------------------");
		
		switch (num) {
		case 10:
			System.out.println("num은 10");
			break;
		case 20:
			System.out.println("num은 20");
			break;
		case 30:
			System.out.println("num은 30");
			break;
		default:
			System.out.println("num은 10,20,30 다 아님");
		}
		
		System.out.println("----------------");
		
		int score = 88;
		if (score>=90) {
			System.out.println("A등급");
		}
		
		//swith는 범위비교를 할 수 없다 ->if문 써야한다
		//switch(score) {
		//case>=90: 에러
//	}
	
	switch( score/10) { //score를 10으로 나눈 몫, 10의 자리 숫자
	case 10:
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
		}
	}
}
