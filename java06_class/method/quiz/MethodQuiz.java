package java06_class.method.quiz;

public class MethodQuiz {
	//---------Q1-------------------
	public int print100() {
		int k=0;
		for (int i = 0; i < 100; i++) {
			k++;
			System.out.println(k);
		}
		return k;
	}
	//---------Q2-------------------
	public void printHello(int num) {
		for (int i = 0; i < num; i++) {
			System.out.println("Hello");
		} return;
		
	}
	//---------Q3-------------------
	public int printText (int cnt, String text) {
		for (int i = 0; i < cnt; i++) {
			System.out.println(text);
			
		} return cnt;
	}
}
