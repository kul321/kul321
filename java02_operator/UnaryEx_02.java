package java02_operator;

public class UnaryEx_02 {
	public static void main(String[] args) {
		
		//���׿����� - ����
		// 	++ : ����������
		//  -- : ���ҿ�����
		
		// �ǿ����ڷ� ������ ������ ���� 1 ����(����)��Ų��
		
		//----------------------------------------
		
		int num;
		num = 15; //������ ���� 15�� �ʱ�ȭ
		System.out.println(num);//������
		
		System.out.println(num--);//���ҿ���, ���� ����, ��ġ ����
		
		System.out.println(num);//���ҿ��� ��
		
		System.out.println("-----------");
		
		num = 15; //������ ���� 15�� �ʱ�ȭ
		System.out.println(num);//������
		System.out.println(--num);//���ҿ���, ���� ����, ��ġ ����
		System.out.println(num);//���ҿ��� ��
		
		System.out.println("-----------");
		
		num = 13;
		System.out.println( num++ -10 + ++num);
		
		
	}
	
}
