package java04_control.star;

public class Star_09 {
	public static void main(String[] args) {
		
		//*****
		//****
		//***
		//**
		//*
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			for(int j=0; j<5-i; j++) { //j, 0 ~ 5-i, x(5-i)
				System.out.print("*");
			}
			System.out.println(); //행마다 개행
		}
		
	}
}
