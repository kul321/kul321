package java06_class.etc;

import java.util.Scanner;

public class MathRandom {
	public static void main(String[] args) {
		
		// class java.lang.Math
		// 	 ��� : ������� ������ �޼ҵ�� �����Ѵ�
		
		//	 �޼ҵ���� ���� static���� ���ǵǾ��ִ�
		
		//-------------------------------------------
		
		//public static double java.lang.Math.random()
		
		//	 0.0���� ũ�ų� ���� 1.0���� ���� Pseudorandom �Ǽ�(double)�� ��ȯ
		//	 ** Pseudorandom, ���� ����, ���� ����
		//	 ** Pseudo,	 ����,	���� == �ٸ糽(��¥��)
		
		//-------------------------------------------
		System.out.println(Math.random()); //0.0 ~ 0.9999999999999999
		System.out.println(Math.random() * 10 ); // 0.0 ~ 9.9999999999999
		System.out.println((int)(Math.random() * 10)); //0~9
		System.out.println((int)(Math.random() * 10)+1); //1~10
		
		//-------------------------------------------
		while(true) {
		int com = (int)(Math.random()*3); // 0 ~ 2, 3���� ���� �� ������ ���� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("0~2 �߿��� ���纸����(����=9) : ");
		int user = sc.nextInt();
		
		if( com == user ) {
			System.out.println("����!!!!!");
			} else {
				System.out.println("Ʋ��! �ٺ�!!!");
			}
		System.out.println("--------------");
		
		if ( user == 9) {
			break;
			}
		}
	}	

}
