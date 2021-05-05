package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	private Student stu = new Student(); //학생 정보 객체
	private Scanner input = new Scanner(System.in); //표준 입력 객체
	
	public StudentService() {
	}
	//이름과 나이 입력(인적사항 입력)
	public void insertInfo() {
		System.out.println("Input Name : ");
		stu.setName( input.nextLine() );
		
		System.out.println("Input Age : ");
		stu.setAge( input.nextInt() );
		
	}
	//국영수 점수 입력(점수 입력)
	public void insertScore() {
		System.out.println("Input Korean : ");
		stu.setKor(input.nextInt());
		
		System.out.println("Input English : ");
		stu.setEng(input.nextInt());
		System.out.println("Input Mathematics : ");
		stu.setMath(input.nextInt());

		this.calcSum();
		this.calcAvg();
		
	}
	//합계 계산
	private void calcSum() {
		stu.setSum( stu.getKor()+stu.getEng()+stu.getMath());
		
		
	}
	//평균 계산
	private void calcAvg() {
		stu.setAvg(stu.getSum()/(double)3);
		
		
	}
	//학생 정보 출력
	public void printStu() {
		System.out.println();
		System.out.println(" --- 학생 정보 ---");
		System.out.println("이름\t 나이\t 국어\t영어\t수학\t총점\t평균");
		
		System.out.print(stu.getName() + "\t");
		System.out.print(stu.getAge() + "\t");
		System.out.print(stu.getKor() + "\t");
		System.out.print(stu.getEng() + "\t");
		System.out.print(stu.getMath() + "\t");
		System.out.print(stu.getSum() + "\t");
		System.out.printf("%.2f", stu.getAvg());
		System.out.println();
		
		//서식문자 %.2f
		//	실수형 데이터를 소수점이하 둘째자리까지 표현한다
		
	}
}
