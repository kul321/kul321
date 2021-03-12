package java04_control.loopQuiz;

public class Quiz3 {
	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=1000; i++) {//i, 1~1000, x1000
			
			if( i%4==1 && i%6==1) {
				sum += i; //조건을 만족하는 값 더하기
			}
		}		
			
		 System.out.println(sum);
	}
}
