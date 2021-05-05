package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu = new Student(); //�л� ���� ��ü
	private Scanner input = new Scanner(System.in); //ǥ�� �Է� ��ü
	
	public StudentService() {
	}
	//�̸��� ���� �Է�(�������� �Է�)
	public void insertInfo() {
		System.out.println("Input Name : ");
		stu.setName( input.nextLine() );
		
		System.out.println("Input Age : ");
		stu.setAge( input.nextInt() );
		
	}
	//������ ���� �Է�(���� �Է�)
	public void insertScore() {
		System.out.println("Input Korean : ");
		stu.setKor(input.nextInt());
		
		System.out.println("Input English : ");
		stu.setEng(input.nextInt());
		System.out.println("Input Mathematics : ");
		stu.setMath(input.nextInt());

		this.calcSum();
		this.calcAvg();
		
	}
	//�հ� ���
	private void calcSum() {
		stu.setSum( stu.getKor()+stu.getEng()+stu.getMath());
		
		
	}
	//��� ���
	private void calcAvg() {
		stu.setAvg(stu.getSum()/(double)3);
		
		
	}
	//�л� ���� ���
	public void printStu() {
		System.out.println();
		System.out.println(" --- �л� ���� ---");
		System.out.println("�̸�\t ����\t ����\t����\t����\t����\t���");
		
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");
		System.out.print(stu.getSum() + "\t");
		System.out.printf("%.2f", stu.getAvg());
		System.out.println();
		
		//���Ĺ��� %.2f
		//	�Ǽ��� �����͸� �Ҽ������� ��°�ڸ����� ǥ���Ѵ�
		
	}
}
