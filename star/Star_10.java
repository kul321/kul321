package java04_control.star;

public class Star_10 {
	public static void main(String[] args) {
		
		//*****
		// ****
		//  ***
		//   **
		//    *

		//*****
		//?****
		//??***
		//???**
		//????*

		for(int i=0; i<5; i++) { //i, 0~4, x5
			
			//'?' 출력하기
			//	i번 만큼 출력한다
			for(int j=0; j<i; j++) {//j, 0 ~ i-1, xi
//				System.out.print("?");
				System.out.print(" ");
			}
			
			//'*' 출력하기
			//	5-i번 만큼 출력한다
			for(int j=0; j<5-i; j++) {//j, 0 ~ 5-i, x(5-i)
				System.out.print("*");
			}
			
			System.out.println(); //행마다 개행
		}
		
		System.out.println("----------");
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			for(int j=0; j<5; j++) { //j, 0~4, x5
				
				if(j<i) {
//					System.out.print("?");
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println(); //행마다 개행
		}
		
		System.out.println("----------");
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			for(int j=0; j<5; j++) { //j, 0~4, x5
				
				System.out.print( j<i ?" " :"*" );
				
			}
			System.out.println(); //행마다 개행
		}
	}
}

















