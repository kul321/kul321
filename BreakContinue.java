package java04_control.loop;

public class BreakContinue {
	public static void main(String[] args) {
		//break;
		//	����� �ߴܽ�Ű�� ������ �����ϴ� �ڵ�
		//	if���� �ߴܽ�Ű�� �ʴ´�
		
		//->for.while, do-while, switch�� �ߴܽ�Ŵ
		//	����� ��ø���� ��� ���� ����� {}����� ����
		// ����� �ߴܽ�Ų��
		
		for(int i=0; i<100; i++) {//i, 0~99, x100
			System.out.println(i);
			
			if( i>=5) {
				break;
			}
			
		}
		
		//-------------------------------------------------
		System.out.println("------------------");
		//continue;
		//	�ݺ������� ����ϴ� ��Ÿ���
		//	���� �ݺ����� �Ѿ��
		
		//	for�� ������ ���������� �Ѿ��
		// while�� ������ ���ǹ����� �Ѿ��
		// do-while�� ������ do�� �Ѿ��
		
		for(int i=0; i<10; i++) { //i, 0~9, x10
			if(i%2==0) {//¦��
				continue; // ���� �ݺ����� �Ѿ��
			}
			System.out.println(i);
			
		}
	}
}
