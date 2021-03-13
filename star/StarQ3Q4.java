package java04_control.star;

public class StarQ3Q4 {
	public static void main(String[] args) {
		//Q3---------------------------------
		for(int i=0; i<5; i++) {
			for(int j=0; j<5;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		} //for¹®1 end
		
		System.out.println("--------------");
		//Q4---------------------------------
		int i;
		int j;
		for( i=1; i<=5; i++) {
			for (j=1; j<=5; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		
	}
}
