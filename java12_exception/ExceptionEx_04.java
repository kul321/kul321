package java12_exception;

public class ExceptionEx_04 {
	public static void main(String[] args) {
		String str = null;
		
		//-----------------------------------
		//NullPointerException �߻� - �ڿ������� ���� �߻�
//		System.out.println(str.length());
		//-----------------------------------
		if(str==null) {
			System.out.println("[ERROR] ���ڿ��� null�Դϴ�");
			System.out.println();
			//���� ���� �߻���Ű��
			//throw new NullPointerException();
		} else {
		System.out.println(str.length());
			
		}
		//----------------------------------
		//���� ���� ��ü ����(throw ���� �ʴ´�)
		NullPointerException e = new NullPointerException();
		if (str == null) {
			throw e; //���� �߻� ����
		}
		//���� ��ü�� ����(new)�Ѵٰ� �ؼ� ���ܰ� �߻�(throw)�Ǵ� ���� �ƴϴ�
		//���� �߻� ��ġ�� ��ü�� ������ ������ �����ȴ�
		// ->throw���� ��ٷ� new�� ���ܰ�ü�� ����� ���� ����
	}//main() end
}//ExceptionEx_04 end

