package java04_control.star;

public class Star_11 {
	public static void main(String[] args) {
		
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		//????*
		//???**
		//??***
		//?****
		//*****
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			
			//"?" ����ϱ�
			//	5-i-1�� �ݺ�
			for(int j=0; j<5-i -1; j++) { //j, 0 ~ 5-i-1, 5-i-1��
//				System.out.print("?");
				System.out.print(" ");
			}
			
			//"*" ����ϱ�
			//	i+1�� �ݺ�
			for(int j=0; j<i+1; j++) { //j, 0~i+1, i+1��
				System.out.print("*");
			}
			
			System.out.println(); //�ึ�� ����
		}
		
		System.out.println("----------");
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			for(int j=0; j<5; j++) { //j, 0~4, x5
				
				if(j<5-i-1) {
//					System.out.print("?");
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			System.out.println(); //�ึ�� ����
		}
		
		System.out.println("----------");
		
		for(int i=0; i<5; i++) { //i, 0~4, x5
			for(int j=0; j<5; j++) { //j, 0~4, x5
				
				System.out.print( j<5-i-1 ?" " :"*" );
				
			}
			System.out.println(); //�ึ�� ����
		}
	}
}










