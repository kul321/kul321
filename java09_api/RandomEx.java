package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//class Random
		//	Math.random() �� ��ȭ�� ������ ���
		//	double�Ӹ� �ƴ϶� int, boolean, long ���� �پ��� Ÿ����
		//	�ǻ糭���� ������ �� �ִ�.
		
		//-------------------------------------------------------
		Random ran = new Random();
		
		System.out.println(ran.nextInt());//int���� ����, �� -21��~ �� 21��
		System.out.println(ran.nextBoolean()); //true || false
		System.out.println(ran.nextDouble()); // 0.0~0.9999999999999
		System.out.println(ran.nextInt(100)); // ������ ������. 0���� 100�� �� ����, 0~99
		System.out.println(ran.nextInt(100)+1);//1~100
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextInt(10));//0~9
			
		}
		
		System.out.println("----------------------");
		
	}

}
