package java04_control.loop;

public class For_07_1 {

	public static void main(String[] args) {
		
		//�ʱ��, �����Ŀ��� ���� ���� �ڵ带 �� �� �ִ�
		//�� �ڵ�� , �� �����Ѵ�
	
		//----------------------------------------
		
		int account = 0;
		
		for(int i = 0, money =10; i<15; i++) {
		
			account += money;
			
			money *= 2;
	
		}
		System.out.println("������ �� �ݾ�: "+account+"��");
				
	}
	
	
}
