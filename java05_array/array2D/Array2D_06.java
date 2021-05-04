package java05_array.array2D;

import java.util.Scanner;

public class Array2D_06 {

	public static void main(String[] args) {
		int[] arr = {10,20,30}; //참조형변수, int형배열 변수
		System.out.println( arr ); //참고값(주소) 출력
		
		String str = "Apple";//참조형변수, String형 변수,문자열 변수
		System.out.println( str);//문자열이 출력됨
		
		//기본적으로는 참조형 변수를 출력하면 참조값이 출력된다
		
		//단, String 변수는 편의상 실제 데이터를 출력하게 만들어져 있다
		
		Scanner sc = new Scanner(System.in);
		System.out.println( sc );
	}

}
