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
		
		//���� �������� �κ� -> Q8
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//���� �������� �κ� -> Q9
		for(int i=0; i<4; i++) { //i, 0~3, x4
			for(int j=0; j<4-i; j++) { //j, 0 ~ 4-i, x(4-i)
				System.out.print("*");
			}
			System.out.println(); //�ึ�� ����
		}
		
		System.out.println("----------");
		
		final int LINE = 9; //����� ��ü �� ��
		
		for(int i=0; i<LINE; i++) { //��ü ��
			
			if( i<=LINE/2 ) { //��� �ٱ��� - �������� ��
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}
			
			if( i>LINE/2 ) { //��� �� ���� - �������� ��
				for(int j=0; j<LINE-i; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println(); //�ึ�� ����
		}
		
	}
}















