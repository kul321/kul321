package java04_control.star;

public class StarQ13 {
	public static void main(String[] args) {
		for (int i=1; i<=5; i++) {
			for (int j=i; j<=5; j++) {
				System.out.print("*");
			}System.out.println();
		}
		for (int i=2; i<=5; i++) {
			for(int j=i; j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
