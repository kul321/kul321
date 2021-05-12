package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		System.out.println("----Stringbuilder 생성----");
//		StringBuilder sb = "Apple"; //에러
		
		StringBuilder sb = new StringBuilder();
		System.out.println("length: "+sb.length());//길이
		System.out.println("capacity: "+sb.capacity());//용량
		
		System.out.println("----Apple추가----");
		sb.append("Apple");
		sb.append(123);
		System.out.println("length: "+sb.length());//길이
		System.out.println("capacity: "+sb.capacity());//용량
		
		System.out.println("---BananaBanana추가---");
		sb.append("BananaBanana");
		System.out.println("length: "+sb.length());//길이
		System.out.println("capacity: "+sb.capacity());//용량
	}
}
