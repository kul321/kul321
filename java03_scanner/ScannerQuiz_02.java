package java03_scanner;

import java.util.Scanner;

public class ScannerQuiz_02 {
	//�л� ���� ���� ���α׷�
	//	�̸�, ����, ����, ����, ����, ����
	//	6���� ������ ������ �� �ִ� ������ �����
	//	������ ����� ������ ����� ����Ѵ�
	
//���� ����)
//===== �Է� =====
//Input Name : Alice
//Input Age : 33
//Input Gender : F
//Input Korean : 100
//Input English : 99
//Input Mathematics : 97

//===== ��� =====
//�̸�	����	����	����	����	����	����	���
//Alice	33		F		100		99		97		296		98.666666667

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		final int SUBJECT = 3; //�� ���� �� (���)
		
		//---------------------------------------------------------
		
		//�̸� �Է�
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.println("[TEST] name : " + name);
		
		
		//���� �Է�
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.println("[TEST] age : " + age);
		
		
		//���� �Է� ( M/F )
		System.out.print("������ �Է��ϼ���(M/F) : ");
		sc.nextLine(); //�Է� ���� ����
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("[TEST] gender : " + gender);
		
		
		//���� ���� �Է�
		System.out.print("����������? ");
		int kor = sc.nextInt();
		
		//���� ���� �Է�
		System.out.print("����������? ");
		int eng = sc.nextInt();
		
		//���� ���� �Է�
		System.out.print("����������? ");
		int math = sc.nextInt();

		System.out.println("[TEST] ������ : " + kor + "," + eng + "," + math);
		
		
		//���� ���ϱ�
		int total = kor + eng + math;
		
		//��� ���ϱ�
		double avg = total / (double)SUBJECT;
		
		System.out.println("[TEST] total: " + total + ", avg: " + avg);
	
		
		//--- ���� ��� --------------------------------------------------
		
		System.out.println("--- ��� ---");
		System.out.println("�̸�\t����\t����\t����\t����\t����\t����\t���");
		
		System.out.print(name + "\t");
		System.out.print(age + "\t");
		System.out.print(gender + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(math + "\t");
		System.out.print(total + "\t");
		
//		System.out.println(avg); //���
		System.out.printf("%.2f", avg); //avg���� �Ҽ��� ��°�ڸ������� �����
		System.out.println();
		
//		System.out.print(name + "\t"
//				+ age + "\t"
//				+ gender + "\t"
//				+ kor + "\t"
//				+ eng + "\t"
//				+ math + "\t"
//				+ total + "\t");
//		System.out.printf("%.2f", avg); //avg���� �Ҽ��� ��°�ڸ������� �����
//		System.out.println();
		
	}
}

















