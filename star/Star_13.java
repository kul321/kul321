package java04_control.star;

public class Star_13 {
	public static void main(String[] args) {
		
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****

		final int LINE = 9; //전체 행 수
		
		for(int i=0; i<LINE; i++) { //행
			
			if( i<=LINE/2 ) { //가운 데 줄까지 -> 감소하는 별
				for(int j=0; j<LINE/2+1-i; j++) {
					System.out.print("*");
				}
				
			} else { //가운데 줄 이후 -> 증가하는 별
				for(int j=0; j<i-LINE/2+1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println(); //행마다 개행
		}
		
	}
}









