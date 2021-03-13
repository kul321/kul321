package java04_control.star;

public class Star_12 {
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		
		//별이 많아지는 부분 -> Q8
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//별이 적어지는 부분 -> Q9
		for(int i=0; i<4; i++) { //i, 0~3, x4
			for(int j=0; j<4-i; j++) { //j, 0 ~ 4-i, x(4-i)
				System.out.print("*");
			}
			System.out.println(); //행마다 개행
		}
		
		System.out.println("----------");
		
		final int LINE = 9; //출력할 전체 줄 수
		
		for(int i=0; i<LINE; i++) { //전체 행
			
			if( i<=LINE/2 ) { //가운데 줄까지 - 많아지는 별
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}
			
			if( i>LINE/2 ) { //가운데 줄 이후 - 적어지는 별
				for(int j=0; j<LINE-i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println(); //행마다 개행
		}
		
	}
}















