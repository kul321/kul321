package java06_class.uml.manage;


public class StudentEx {
	public static void main(String[] args) {
		
		StudentService ss;
		ss = new StudentService();
		
		ss.insertInfo(); //�̸��� ���� �Է�
		
		ss.insertScore(); //������ ���� �Է�
		
		ss.printStu(); //�л� ���� ���
		
	}
}


