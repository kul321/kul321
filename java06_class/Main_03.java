package java06_class;

public class Main_03 {
	public static void main(String[] args) {
		Class_03 cl = new Class_03();
		
//		System.out.println(cl.num);//����<-���� ���� ��
		
		//setter�� �̿��� �ʵ尪 ����
		cl.setNum(123);
		
		//getter�� �̿��� �ʵ尪 ���
		System.out.println(cl.getNum());
		
		
		//private�����ڷ� ����ʵ忡 ���� �ܺ� ������ ����
		//getter, setter �޼ҵ带 �̿��Ͽ� �Ϻκи� ������ ����Ѵ�
		//	 getter: ����ʵ��� ���� �ҷ��´�
		//	 setter: ����ʵ忡 ���� �����Ѵ�
	}
}
