package java04_control.loop;

public class For_10_1 {
	public static void main(String[] args) {
		
		//��ø�� for loop
		//	2~9�� ������
		
		//2 x 1 = 2
		
		//2��~9�ܱ��� 8�� �ݺ� i
		//�� �ȿ��� ���� �ݺ� j
		
		int i;
		int j;
		for (i=2; i<10; i++) {
			System.out.println("-------"+i+"��-------");
			for(j=1; j<10; j++) {
				System.out.print(i + " x "+ j + " = "+ i * j+" ");
			}
		}
	}

}
