package java05_array.quiz;

import java.util.Scanner;

public class ArrayQuizMe_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[];
		arr = new int[6];
		
		//1.각 층에 사는 인원을 담는 배열 1~5층, 총 합 6
		for (int i=0; i<arr.length-1; i++) {
			System.out.println(i+1 + "층 인원은?: ");
			arr [i] = sc.nextInt();
			
		System.out.println("-----------------출력");
		

		}
			
			
		

		
	}

}
