package java06_class.overloading;

public class Overloading {
	
	//����ʵ�
	private int x;
	private int y;
	
	//����ʵ� x,y�� ����ϴ� ��� - ����޼ҵ�
	public void display() {
		System.out.println("("+x+", "+y+")");
		
	}
	//����ʵ� x,y�� ���� �����ϰ��� ����ϴ� ��� - ����޼ҵ�
	//�ٵ� ���� �̸��� ����
	public void display(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.println("("+this.x + ", "+this.y+")");
	}
	//---------------------------------
	public void display(double d) {
		
	}
	public void display(String str) {
		
	}
//	public int display() {<-����Ÿ�Ը� �ٸ� ��� �����ε� ���� �Ұ� 
//	}
	
}
