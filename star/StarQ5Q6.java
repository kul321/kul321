package java04_control.star;

public class StarQ5Q6 {
	public static void main(String[] args) {
		
		//Q5---------------------------------
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println("----------------");
		//Q6---------------------------------
		for(int i=0; i<5; i++) {
			for(int j=i+1; j<=i+5; j++) {
				System.out.print(j);
				}System.out.println();
		}
	}

}
