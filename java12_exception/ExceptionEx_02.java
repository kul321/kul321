package java12_exception;

public class ExceptionEx_02 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int i=0;
		try {
		while(true) {
			
			
			arr[i] = i+1;//�迭�� �� ����
			System.out.println(arr[i]);
			
			i++;
			}//while() ed
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[EXCEPTION] �ε��� ���!!");
			
			//�⺻���� ���Ǵ� ���� ��Ȳ ��� �޼ҵ�
			e.printStackTrace();
		}
		System.out.println("+++���α׷� ���� ����+++");
		
		
	}
	
}
