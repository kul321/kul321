package java11_generic;

//�Ϲ� Ŭ����
class Class03{
	//���׸� �޼ҵ�
	public <T> void display(int num) {
		int data;
		data = num;
		
	}//display(int)end
	
	//��ȯŸ��, �Ű��������� ���׸� Ÿ�� ���
	public <T> T out(T obj) {
		T data;//������������ ���׸� Ÿ�� ���
		data = obj;
		return data;
	
	}//out(T obj) end
}//Class03 end

public class Generic_03_GenericMethod {

	public static void main(String[] args) {
		Class03 c03 = new Class03();
		
		c03.out(12345); //Ÿ���Ķ���͸� ���޾���, T -> Integer(�ڵ� ��ȯ)
		c03.<Double>out(45.76);//Ÿ���Ķ���͸� Double�� ����, T->Double(�ڵ��� �ƴ϶� ���)
	}//main() end

}//Generic_03_GenericMethod end
