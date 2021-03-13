package java04_control.star;

public class StarQ7Q8Q9 {
	public static void main(String[] args) {
		//Q7---------------------------------
		for (int i=6; i>=2; i--) {
			for (int j=i-1; j<=i+3; j++) {
				System.out.print(j);
			}System.out.println();
		}
		System.out.println("------------------");
		//Q8---------------------------------
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for (int j=i; j<=4; j++) {
				System.out.print(" ");
			}System.out.println();
		}
		System.out.println("------------------");
		//Q9---------------------------------
		
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}
			for (int j=1; j<=i; j++) {
				System.out.print(" ");
			}System.out.println();
		}
	}

}
