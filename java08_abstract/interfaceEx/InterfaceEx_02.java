package java08_abstract.interfaceEx;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();//�ڽ�Ŭ������ out() �޼ҵ� ȣ��
		
		System.out.println("-------------------");
		
		Parent p;//�θ�Ÿ�� ��ü ����
		p = new Child(); //�θ�Ÿ��<-�ڽ�Ÿ��
		p.out();//�ڽ�Ŭ������ out() �޼ҵ� ȣ��(�������ε�, �ν��Ͻ� Ȯ��)
		System.out.println("-------------------");
		
		//** extends�� Ŭ������ �θ�Ŭ������ �ȴ�
		//** implements�� �������̽��� �θ� Ÿ���� �ȴ�
		
		Inter_01 i01; //�������̽� ��ü ����
		i01 = new Child(); //Child ��ü ����, �θ�Ÿ��<-�ڽ�Ÿ��
		
		i01.out();//�ڽ�Ŭ������ out() �޼ҵ� ȣ��(�������ε�, �ν��Ͻ� Ȯ��)
		
		System.out.println("-------------------");
		
		Inter_02 i02 = new Child();
		i02.out();
		
//		** �ڹٴ� ���� ����� �����ϰ� �ִ�
//			-> extends Ű����� �� ���� Ŭ������ ��ӹ��� �� �ִ�
//		class P1{
//			public void out() {
//				System.out.println("P1");
//			}
//		}
//		class P2{
//			public void out() {
//				System.out.println("P2");
//			}
//		}
//		class Child extends P1, P2{ //���� ���
//			 public void out() {
//				 -> P1, P2 �� � �޼ҵ带 ��ӹ޾ƾ� �ϴ��� ���� �� ����
//			 }
//		}
	}

}
