package java04_control.loopQuiz;

public class Quiz3 {
	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=1000; i++) {//i, 1~1000, x1000
			
			if( i%4==1 && i%6==1) {
				sum += i; //������ �����ϴ� �� ���ϱ�
			}
		}		
			
		 System.out.println(sum);
	}
}
