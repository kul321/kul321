package java04_control.loopQuiz;

import java.util.Scanner;

public class Quiz4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int max;
		int min =1;
		int i = 2; //변수 선언
		
		System.out.println("Num1: ");
		num1 = sc.nextInt();
		System.out.println("Num2: ");
		num2 = sc.nextInt();//두 수 입력
		
		for(;i<=num1 && i<=num2;) {
			if(num1%i==0 && num2%i==0) {
			
					min =i;
					i++;
				
			} 
			max = (num1*num2)/min;
			System.out.println("최소 공배수 : " + max);
			System.out.println("최대 공약수 : " + min);
			sc.close();
		}
	}

}
