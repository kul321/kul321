package java04_control.star;

public class Star_08 {
	public static void main(String[] args) {
		
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0; i<5; i++) { //i��° ��, 0~4, x5
			for(int j=0; j<i+1; j++) {//j, 0~i, (i+1)�� //�ึ�� �ݺ��Ǵ� Ƚ��
				System.out.print("*");
			}
			System.out.println(); //�ึ�� ����
		}

		System.out.println("----------");
		
		for(int i=1; i<=5; i++) { //i, 1~5, x5
			for(int j=0; j<i; j++) {//j, 0 ~ i-1, i��
				System.out.print("*");
			}
			System.out.println(); //�ึ�� ����
		}

	}
}




