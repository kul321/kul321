package java06_class.method;

public class Method_02 {
	//�Ű�����(parameter, argument)
	//��ȯ������(return)
	
	//--------------------------------
	
	//�Ű�����x , ��ȯ������x
	public void method1() {
		System.out.println("Hello");
		
	}
	
	//�Ű�����o, ��ȯ������x
	public void method2(int parameter) {//�Ű����� ==parameter
		System.out.println("���޵� �� : "+parameter);
	}
	//�Ű�����x, ��ȯ������o
	public int returnNum() {
		return 333;
	}
	//----------------------------------
	//�Ű�����o, ��ȯ������o
	public int plus(int n1, int n2) {
		return n1+n2;
	}
}
