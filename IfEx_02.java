package java04_control.condition;

public class IfEx_02 {
	public static void main(String[] args) {
		int num = 10;
		if ( num == 15 ) {
			System.out.println("HI");
			
		}
		System.out.println("Hello");
		
		//----------------------------------------
		
		// {}�߰�ȣ�� ���� ���� �ڵ带 �����ִ� ������ �Ѵ�
		// �ڵ� ���� �������� ������ ���� �ʴ´�
		{
			System.out.println("Apple");
			System.out.println("Banana");
			System.out.println("Cherry");
		}
		//------------------------------------------
		
		//����� �ش� ��� ������ ���� �ڵ� �� �� �Ǵ� {} �߰�ȣ �� ����
		//�����Ѵ�(������ �ش�)
		
		if (false)
			System.out.println("�ڵ�11111");
			System.out.println("�ڵ�22222");
			
		System.out.println("---------------------");
		
		//����� ������ �޴� �ڵ尡 �� ���̾ �����ϸ� {}�߰�ȣ �� ��
		//--------------------------------------------------
		
//		!!!!!!! if (false); �̷������� �����ݷ� �� �ٵ��� ���� !!!!!!!!!!
	}
}
