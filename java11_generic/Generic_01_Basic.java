package java11_generic;

import java.util.ArrayList;

public class Generic_01_Basic {
	public static void main(String[] args) {
		
		// public class ArrayList<E>
		//	-> Ŭ������ �����ϸ� ������� <E>�� ���׸��̶�� �Ѵ�
		
		//---------------------------------------------------------
		//���׸��� Ư�� ������Ÿ������ �����ϸ鼭 �ڵ带 ����� �� �ִ�
				//	-> Ÿ�� �Ķ����(���׸��� Ÿ���� �����ϴ� ��)
		
		//Ÿ���Ķ���͸� �������� ����
		//	->�ڵ����� Object���� ������
		ArrayList list1  = new ArrayList();
		
		//Ÿ���Ķ���͸� StringŸ������ ������
		ArrayList<String> list2 = new ArrayList<String>();
		//���׸��� Ư�� ������Ÿ������ �����ϸ鼭 �ڵ带 ����� �� �ִ�
		//	->Ÿ�� �Ķ����(���׸��� Ÿ���� �����ϴ� ��)
		
		//--------------------------------------------------
		//Ÿ���Ķ���Ͱ� Object�� �����Ǿ��� ������ � Ÿ���̵��� ��� ����
		list1.add(123);
		list1.add("Apple");
		list1.add(true);
		
		//--------------------------------------------------
		
		//Ÿ���Ķ���Ͱ� String���� �����Ǿ��� ������ String�� ��� ����
//		list2.add(123);//����
		list2.add("Apple");
		list2.add("Banana");
		
		//--------------------------------------------------
		
		//Ÿ���Ķ���ʹ� �⺻������Ÿ������ ������ �� ����
		//	->WrapperŬ���� ����ؾ��Ѵ�
//		ArrayList<int> list3;//����
		
		ArrayList<Integer>list3 = new ArrayList<Integer>();
		list3.add(123);//����ڽ�, ����� ������ int Ÿ�� �ᵵ �ȴ�
		
		//--------------------------------------------------
		//��ü�� �����ϴ� �ڵ忡���� Ÿ���Ķ���͸� ������ �� �ִ�
		//	-> JDK 1.7���� ����
//		ArrayList<String> list4 = new ArrayList<String>();
		ArrayList<String> list4 = new ArrayList<>();
		
		//--------------------------------------------------
		//Ÿ���Ķ���͸� String���� ����
		ArrayList<String> list5 = new ArrayList<>();
		
		//String�� ����� �� �ֵ��� ���´�
//		list5.add(123);//����
//		list5.add(3.14);//����
		
		list5.add("�ȳ�");
		
		String data = list5.get(0);//String���� ��ȯ��
		//Ÿ���Ķ���͸� Ư�� ������Ÿ������ �����ϸ�
		//Ÿ�� �������� �����ȴ�
		
		//** Ÿ�� ������, Type Safety
		//	��ü �Ǵ� �޼ҵ尡 �ǵ����� ���� ������Ÿ������
		//	���Ǵ� ��Ȳ�� �����ϴ� Ư��
		
		//	���α׷��� �����ڰ� �ǵ��� ������Ÿ�Ը� ����ϵ��� �����Ѵ�
		//--------------------------------------------------
		
		//Ÿ���Ķ���͸� �������� ���� - Ÿ�� �������� ���� ��Ȳ
		ArrayList list6 = new ArrayList(); //Ÿ���Ķ����->Object
		list6.add("HI");
		list6.add("Hello");
		list6.add("Hola");
		
//		String str = list6.get(0); //����, ObjectŸ������ ��ȯ��
		String str = (String) list6.get(0); //����ȯ�� �ʿ��ϴ�
	
		
				
		
		
	}
}
