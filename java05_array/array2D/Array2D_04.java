package java05_array.array2D;

import java.util.Scanner;

public class Array2D_04 {

	public static void main(String[] args) {
		// new
		//	 동적 할당 연산자
		
		//	 **정적할당 : 변수 선언
		//	 **동적할당 : new연산자를 이용한 공간 생성
		
		//	 할당: 변수 공간이 생성됨(저장 공간 생성)
		
		//	 정적, static : 실행되기 직전
		//	 동적, dynamic : 실행 중

		//---------------------------------------------
		int num; //int형 변수 선언 -> 정적 할당
		
		int[] arr; //int[]형 변수 선언 -> 정적 할당
		
		//메인메소드에서 정적할당된 변수들은 Stack메모리영역에 저장된다
		
		//---------------------------------------------
		arr = new int[5]; //int[5] 배열 공간 생성 -> 동적 할당
		
		//동적할당된 저장 공간들은 Heap메모리영역에 생성된다
		
		//---------------------------------------------
		//int[] arr2 = new int[-7];
		
		// 배열 생성(new)은 동적할당
		// ->컴파일 시점에서는 에러인지 판단이 안 섬 그래서 전구느낌표 모양이 뜨는 것
		// 실행해봐야 비로소 빨간 에러 문자가 뜸
		
		//---------------------------------------------
		int[][] arr3 = new int[3][];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<arr3.length; i++) {
			System.out.print(i + "행 배열의 크기는? ");
			int len = sc.nextInt();
			
			arr3[i] = new int[len];
		}//for1 end
		
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<arr3[i].length; j++) {
				System.out.print(arr3[i][j]+" ");
			}
		System.out.println();
		}
	}
}
