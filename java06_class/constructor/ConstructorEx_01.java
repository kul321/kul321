package java06_class.constructor;

//java06_class.constructor.
class Constructor {
	//��� �ʵ�
	private int num1;
	private int num2;
	
//	private int num1 = 111;
//	private int num2 = 222; <- ����ʵ忡�� �����ʱ�ȭ
	
	
	//����Ʈ ������
	//  -> �Ű������� ���� ������
	public Constructor() {
		System.out.println("����Ʈ ������ ȣ���");
		
		System.out.println("--- ������ �̿� �ʱ�ȭ �� ---");
		System.out.println("num1: "+ num1 + ", num2: "+num2);
		
		//����ʵ� �ʱ�ȭ
		num1 = 500;
		num2 = 600;
		System.out.println("--- ������ �̿� �ʱ�ȭ �� ---");
		System.out.println("num1: "+ num1 + ", num2: "+num2);
	}
	
	//�Ű������� �ִ� ������ (�����ε�)
	public Constructor(int num1, int num2) {
		
	}
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}



//java06_class.constructor.ConstructorEx_01
public class ConstructorEx_01 {

	public static void main(String[] args) {
		
		//��ü����
		Constructor cons;
		
		//��ü����
		cons = new Constructor();
		
		//-----------------------------------
		System.out.println("-------------");
		
		Constructor cons02;
		cons02 = new Constructor(333, 444);
		
		System.out.println("cons: "+ cons.getNum1()+", "+cons.getNum2());
		System.out.println("cons02: "+ cons02.getNum1()+", "+cons02.getNum2());
		
	}

}
//ctrl+shift+ [ : ���� ȭ�� ����  
//ctrl+shift+ - : ���� ȭ�� ����