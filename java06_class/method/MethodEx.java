package java06_class.method;

import java.util.Arrays;

public class MethodEx {
	public static void main(String[] args) {
		Method_01 m01 = new Method_01();
		int result = m01.add(11, 22); //�޼ҵ� ȣ��
		System.out.println("������ ��� :"+result);
		System.out.println("--------------------------");
		System.out.println("������ ��� :"+m01.add(333,444));
		System.out.println("---Method02-----");
		
		Method_02 m02 = new Method_02();
		
		m02.method1(); //��ҵ� ȣ��\
		m02.method2(777);
		//�����ϴ� ������ - ��������, �����μ�, ����, �μ�
		//	argument
		System.out.println("��ȯ��: " +m02.returnNum());
		System.out.println("���� ���: "+m02.plus(100, 200));
		System.out.println("--- Method_03--------");
		
		Method_03 m03 = new Method_03();
		int[] arr = new int[5];//int�� �迭
		arr[2] = 100;
		
		System.out.println(Arrays.toString(arr)); //�迭 ��ü ���
		
		m03.arrayTest(arr); //�迭�� �������ڷ� ����
		
		System.out.println(Arrays.toString(arr)); //�迭 ��ü ���
	
		System.out.println("---�⺻�� ���� �׽�Ʈ---");
		
		int num = 888;
		System.out.println("�� : " + num);
		m03.primitiveTest(num);
		System.out.println("�� : " + num);
		
		System.out.println("---Method_04-------------");
		Method_04 m04 = new Method_04();
		m04.returnTest01();
	}

}
