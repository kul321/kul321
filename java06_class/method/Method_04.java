package java06_class.method;

public class Method_04 {
	public void returnTest01() {
		for(int i=0; i<100; i++) {
			if( i==5 ) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("�ݺ��� ���� �� �����");
	}
	
	public int returnTest02(int num) {
		if( num<0 ) {//�������ڰ� ������� ó������ ����
			return -1;//�׳� ���ϸ� �� �� ���� ��쿡, Ư���� ����
		}
		for (int i = 0; i < num; i++) {//numȽ������
			System.out.println("Apple");
		}
		return num;
	}
}
