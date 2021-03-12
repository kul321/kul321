package java04_control.loopQuiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("ют╥б: ");
		num = sc.nextInt();
		
		int div = 1;
		for(div=1; div<=num; div++) {
			if((num%div ==0)) {
				System.out.println(div);
			}
		}
		sc.close();
		
		
	}

}
