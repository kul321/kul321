package java01_variables; //��Ű�� ����

public class VariablesEx_04 {//Ŭ���� ����
	public static void main(String[] args) {//���� �޼ҵ�
	//���� ���� - double�� height����
	double height; //����� Ű
	
	//������ �� ����
	height = 200.5;
	
	//������ �� ���
	System.out.println( "height ������ ���� : " + height );
	
	// +  ��ȣ : ���ڿ� ���� ���
	
	//------------------------------------------------------------
	
	double data;
	
	data = height + 100; //����
	System.out.println("data : " + data);
	
	//-------------------------------------------------------------
	
	char alpha;
	//alpha = 'T'; // 84
	alpha = 86; // 'V'
	
	System.out.println(alpha);
	
	//-------------------------------------------------------------
	boolean isRight;
	//isRight = true; //��
	isRight = false; //����
	
	System.out.println( isRight );
	//boolean�� ������ true/false �� ���� ���� ������ �� �ִ�
	
	}//���� end
}//Ŭ���� end
