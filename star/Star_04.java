package java04_control.star;

public class Star_04 {
	public static void main(String[] args) {
		
		//11111
		//22222
		//33333
		//44444
		//55555
		
		for(int i=0; i<5; i++) { // i번째 행
			for(int j=0; j<5; j++) { // j번째 열
				System.out.print( i+1 ); //행과 관련
			}
			System.out.println(); //행마다 개행
		}
		
	}
}
