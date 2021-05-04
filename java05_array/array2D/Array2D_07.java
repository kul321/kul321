package java05_array.array2D;

import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

import java04_control.loop.For_01;

public class Array2D_07 {

	public static void main(String[] args) {
		// 학생 성적 관리 프로그램
		
		//1~3학년
		//2개의 반
		//4명의 학생
		//3과목 int형 배열 3개짜리
		//점수
		//int[][][][] score = new int[3][2][4][3]; 4차원 이상 쓸 수도 있지만 별로라
		
		//int[][][] sco1 = new int[2][4][3];
		//int[][][] sco2 = new int[2][4][3];
		//int[][][] sco3 = new int[2][4][3]; 이런식으로 억지로라도 나눠서 씀
		
		//--------------------------------------
		
		//2명의 국어, 영어, 수학 점수를 저장하는 배열
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //학생들의 총점 배열
		double[] avg = new double[2]; //학생들의 평균 배열
		
		//----- 2명 학생들의 3과목 점수 입력받기 -----
		Scanner sc = new Scanner(System.in); //입력 객체
		
		String[] subject = {"국어", "영어", "수학" };
		for (int i = 0; i < sco.length; i++) { //i번째 학생, 0~1, x2
	
			for (int j = 0; j < sco[i].length; j++) { //j번째 과목 점수, 0~2, x3
				System.out.print((i+1)+"번 학생의 "+ subject[j]+"과목 점수 입력: ");
				sco [i][j] = sc.nextInt();
				
			} 
			System.out.println();
		} 
//		//TEST - 점수가 잘 입력되었는지 테스트
//		for (int i = 0; i < sco.length; i++) {
//			for (int j = 0; j < sco[i].length; j++) {
//				System.out.print(sco[i][j] +" ");
//			}
//			System.out.println();
			
//		}
		
		
		
		//--------------------------------------------
		
		//----- 총점 구하기 -----
		for(int i=0; i<sco.length; i++) {//i번째 학생
			for (int j = 0; j < sco[i].length; j++) {
				sum[i] += sco[i][j]; //총점계산
			}
		}
		//-----------------------
		
		//----- 평균 구하기 -----
		for (int i = 0; i < sco.length; i++) {//번째 학생
			avg[i] = sum [i] / (double)3;
//			avg[i] = sum [i] / (double)subject.length;
		}
		//-----------------------
		
//		//TEST - 총점, 평균 확인
//		for(int i=0; i<sco.length; i++) {
//			System.out.println("sum: "+ sum[i] + ", avg: "+ avg[i]);
//		}
		
		//----- 종합 출력 -------
		//ex)	번호	국어	영어	수학	총점	평균
		//		1번		xxx		xxx		xxx		xxx		xxx.xx
		//		2번		xxx		xxx		xxx		xxx		xxx.xx
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		
		for (int i = 0; i < sco.length; i++) {//i번째 학생
			System.out.print((i+1)+"번");//번호
			
			for (int j = 0; j < sco[i].length; j++) {//j번째 과목
				System.out.print("\t"+sco[i][j]);
			}
			System.out.print("\t"+sum[i]); //총점
			System.out.println("\t"+ Math.round(avg[i]*100)/(double)100); //평균			
		}
		//-----------------------
		
		

	}

}
