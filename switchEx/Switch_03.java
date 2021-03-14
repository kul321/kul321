package java04_control.switchEx;

public class Switch_03 {

	public static void main(String[] args) {
		
		//s논리형(boolean) 데이터를 switch에 사용할 수 없음
//		boolean b = true;
//		switch(b) {

		//-----------------------------------------
		//실수형 데이터도 마찬가지로 switch에 사용 불가
		//double dVal = 322.435;
		//switch(dVal) {
		
		//-----------------------------------------
		//switch에서 char형 사용하기
		char alpha = 'B';//<-정수로 처리됨
		switch (alpha){
		case 'A':
			System.out.println("A이다");
			break;
		case 'B':
			System.out.println("B이다");
			break;
		case 'C':
			System.out.println("C이다");
			break;
		default :
			System.out.println("다 아님");
			
		}
	}

}
