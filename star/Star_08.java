package java04_control.star;

public class Star_08 {
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0; i<5; i++) { //i번째 행, 0~4, x5
			for(int j=0; j<i+1; j++) {//j, 0~i, (i+1)번 //행마다 반복되는 횟수
				System.out.print("*");
			}
			System.out.println(); //행마다 개행
		}

		System.out.println("----------");
		
		for(int i=1; i<=5; i++) { //i, 1~5, x5
			for(int j=0; j<i; j++) {//j, 0 ~ i-1, i번
				System.out.print("*");
			}
			System.out.println(); //행마다 개행
		}

	}
}




