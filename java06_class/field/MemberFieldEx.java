package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {

	MemberField_01 mf01 = new MemberField_01();
	MemberField_01 mf02 = new MemberField_01();
	MemberField_01 mf03 = null;
	
	//System.out.println(mf01.num); //private ����
	
	System.out.println(mf02.getNum());
	
	mf02.setNum(777);
	System.out.println(mf02.getNum());
	//------------------------------------------
//	System.out.println(mf03.getNum());//���� �߻�
	//NullPointerException �߻�
	//	null �������� �̿��� ����� ������ �� �߻��Ѵ�
	
	//	-> ��û ���� ���̴� ����! - �� ����� ��!!
	
	System.out.println();
	System.out.println("----- Ŭ�������� �׽�Ʈ -----");
	
	MemberField_02 mf04 = new MemberField_02();
	MemberField_02 mf05 = new MemberField_02();
	System.out.println(mf04.city);
	System.out.println(mf05.city);
	
	mf04.city = "Busan";
	
	System.out.println("--- Busan ���� ---");
	System.out.println(mf04.city);
	System.out.println(mf05.city);// �Ѵ� �ٲ������
	
	
	//Ŭ���������� ��ü�� �ƴ� Ŭ�������� ���� �����ϴ� �� ����
	MemberField_02.city = "Incheon";
	System.out.println(MemberField_02.city);
	}

}
