package java04_control.star;

public class Star_07 {
	public static void main(String[] args) {
		
		//56789
		//45678
		//34567
		//23456
		//12345
		
		for(int i=0; i<5; i++) { //i행, 0~4, x5
			for(int j=0; j<5; j++) { //j행, 0~4, x5
				System.out.print(5-i+j);
			}
			System.out.println(); //행마다 개행
		}
		
		System.out.println("----------");
		
		for(int i=5; i>=1; i--) { //i, 5~1, x5
			for(int j=0; j<5; j++) { //j, 0~4, x5
				System.out.print(i+j);
			}
			System.out.println(); //행마다 개행
		}
		
		System.out.println("----------");
		
		for(int i=5; i>=1; i--) { //i, 5~1, x5
			for(int j=i; j<i+5; j++) { //j, i ~ i+4, x5
				System.out.print(j);
			}
			System.out.println(); //행마다 개행
		}
		
	}
}












