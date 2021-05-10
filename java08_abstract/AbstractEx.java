package java08_abstract;

abstract class Person{//�θ�Ŭ����
	protected String name; //�̸�
	
	public Person(String name) {
		this.name = name;
	}
	
	//�߻�޼ҵ�
	public abstract void display(); //��ü�� ������ ����ϴ� ���
}

class Professor extends Person{//�ڽ�Ŭ����
	private String major; //����
	
	public Professor(String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
		public void display() {
			System.out.println("[����] : " + name + ", "+ major + "����");
		}//display() end
}

class Student extends Person{//�ڽ�Ŭ����
	private String subject; //��������
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	@Override
		public void display() {
		System.out.println("[�л�] : " + name + ", "+ subject + "����");
		}//display() end
		
	
}

public class AbstractEx {

	public static void main(String[] args) {
		

	}

}
