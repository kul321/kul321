package java09_api;

import java.util.StringTokenizer;

public class StringToken {
	public static void main(String[] args) {
		String data1 = "Hi Hello Hola";
		String[] token1 = data1.split(" ");
		//" "(����)�� �����ڷ� data1�� ��ūȭ�Ѵ�
		//	-> ����� String[] Ÿ������ ��ȯ
		
		for (int i = 0; i < token1.length; i++) {
			System.out.println(i + " : "+token1[i]);
			
		}//for() end
		System.out.println("---------------------");
		
		String data2 = "I%!am%!iron%!man";
		String[] token2 = data2.split("%!");
		
		for (int i = 0; i < token2.length; i++) {
			System.out.println(i + " : " + token2[i]);	
			
		}
		System.out.println("-------------------");
//		data1 == "Hi Hello Hola"
		StringTokenizer st1 = new StringTokenizer(data1);//������ ������
		
		System.out.println("��ū�� ���� : "+st1.countTokens());
		
		//��ū�� �����ϴ� ��ŭ �ݺ�
		while(st1.hasMoreTokens()) {
			//��ū�� ��ȯ�Ѵ�-���
			System.out.println(st1.nextToken());
		}
		
		//public boolean hasMoreTokens();
		//		��ū�� �����ϸ� true ��ȯ, ������ false��ȯ
		//public String nextToken();
		//		��ū�� ��ȯ�ϰ�, ���� ��ū�� ����Ű�� �����
		System.out.println("---------------------");
		
//		data2 =="I%!am%!iron%!man";
		StringTokenizer st2 = new StringTokenizer(data2,"%!");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
//		System.out.println(st2.nextToken());<-�ѹ� �� �߰������� ����, NoSuchElementException
	}
}
