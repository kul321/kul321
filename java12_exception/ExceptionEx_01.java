package java12_exception;

public class ExceptionEx_01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int i=0;
		while(true) {
			
			//���� �߻� ��Ȳ
			if(i<0 || i>=arr.length) {//����ó�� if��
				break;
			}
			arr[i] = i+1;//�迭�� �� ����
			System.out.println(arr[i]);
			
			i++;
		}//while() ed
		System.out.println("+++���α׷� ���� ����+++");
		
		
	}
	
}
