package java09_api;

public class StringBuilderEx {
	public static void main(String[] args) {
		System.out.println("----Stringbuilder ����----");
//		StringBuilder sb = "Apple"; //����
		
		StringBuilder sb = new StringBuilder();
		System.out.println("length: "+sb.length());//����
		System.out.println("capacity: "+sb.capacity());//�뷮
		
		System.out.println("----Apple�߰�----");
		sb.append("Apple");
		sb.append(123);
		System.out.println("length: "+sb.length());//����
		System.out.println("capacity: "+sb.capacity());//�뷮
		
		System.out.println("---BananaBanana�߰�---");
		sb.append("BananaBanana");
		System.out.println("length: "+sb.length());//����
		System.out.println("capacity: "+sb.capacity());//�뷮
	}
}
