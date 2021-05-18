package java12_exception;

public class ExceptionEx_01 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int i=0;
		while(true) {
			
			//예외 발생 상황
			if(i<0 || i>=arr.length) {//예외처리 if문
				break;
			}
			arr[i] = i+1;//배열에 값 대입
			System.out.println(arr[i]);
			
			i++;
		}//while() ed
		System.out.println("+++프로그램 정상 종료+++");
		
		
	}
	
}
