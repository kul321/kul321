package java09_api;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		
		//class Random
		//	Math.random() 를 강화한 버전의 기능
		//	double뿐만 아니라 int, boolean, long 등의 다양한 타입의
		//	의사난수를 생성할 수 있다.
		
		//-------------------------------------------------------
		Random ran = new Random();
		
		System.out.println(ran.nextInt());//int형의 범위, 약 -21억~ 약 21억
		System.out.println(ran.nextBoolean()); //true || false
		System.out.println(ran.nextDouble()); // 0.0~0.9999999999999
		System.out.println(ran.nextInt(100)); // 범위가 정해짐. 0부터 100개 중 랜덤, 0~99
		System.out.println(ran.nextInt(100)+1);//1~100
		
		for (int i = 0; i < 5; i++) {
			System.out.println(ran.nextInt(10));//0~9
			
		}
		
		System.out.println("----------------------");
		
	}

}
