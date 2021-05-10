package java08_abstract.interfaceEx;

abstract class TestClass{//�߻�Ŭ����
	int num; //����ʵ�, �ν��Ͻ� ����
	
	public void method() {//����޼ҵ�, �Ϲ� �޼ҵ�
	}
	
	public abstract void method1();//����޼ҵ�, �߻�޼ҵ�
	public abstract void method2();//����޼ҵ�, �߻�޼ҵ�

}

interface TestInterface{//�������̽�
	//��� & �߻�޼ҵ常 ����� ������
	
	
	//---------------------------------------------------------------------
	
	//public static final Ű���带 ���� �ʵ常 ��������(���)
	public static final int NUM = 123;//����� ���ÿ� �ʱ�ȭ�� �ݵ�� ������Ѵ�
	
	int NUM2 = 345;//public static final Ű���带 �����ص� �ڵ����� �ٿ��� �����ȴ�
	public int num3 = 567;
	static int num4 = 36;// �� ��. �׷��� �򰥸��� ������ Ű���� ���� �Ἥ ǥ��
	
	//-------------------------------------------------------------------------
//	public void method() {// �������̽��� �Ϲ� �޼ҵ带 ����� ���� �� ����
	
//	public abstract void out();//�߻�޼ҵ� 
	
	public default void out() {
		
	}
	
	//abstract Ű���� ���� �޼ҵ带 �ۼ��ص� �߻�޼ҵ�� ó���ȴ�
	public void display();//�߻�޼ҵ�

	
	
	
	class Test extends TestClass{
		@Override
		public void method1() {
		}
		@Override
		public void method2() {
		}
	}
	
//--------------------------------------------

	
class Test2 implements TestInterface {
	
	@Override
	public void out() {
	}
	
	@Override
	public void display() {
		
	}
}
//--------------------------------------------

class Test3 extends TestClass implements TestInterface{
	//---- TestInterface�� ��� �޼ҵ� ---
	@Override
	public void display() {

	}
	//-------------------------------------
	//------TestClass�� ��� �޼ҵ�-------
	@Override
	public void method1() {
	}
	@Override
	public void method2() {
	}
	//-------------------------------
	
}


public class InterfaceEx_01 {
	final int test2 = 3;
	int test;
	
	static int test3;
	
	public static void main(String[] args) {
		
		//�������̽��� ���
		System.out.println(TestInterface.NUM);
		System.out.println(TestInterface.NUM2);
		
		//--------------------------------------
		
		//�������̽��� ��ӹ��� Ŭ������ ���
		System.out.println(Test3.NUM);
		System.out.println(Test3.NUM2);
		
	}
	}
}