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

		final int LINE = 9; //��ü �� ��
		
		for(int i=0; i<LINE; i++) { //��
			
			if( i<=LINE/2 ) { //���� �� �ٱ��� -> �����ϴ� ��
				for(int j=0; j<LINE/2+1-i; j++) {
					System.out.print("*");
				}
				
			} else { //��� �� ���� -> �����ϴ� ��
				for(int j=0; j<i-LINE/2+1; j++) {
					System.out.print("*");
				}
			}
			
			System.out.println(); //�ึ�� ����
		}
		
	}
}









