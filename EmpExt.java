package ex;

import java.util.List;
import java.util.Scanner;

import dao.EmpDao;
import dao.EmpDaoImpl;
import dto.Emp;

//실행 클래스
public class EmpEx {

	//EmpDao 객체 생성 - DB연결
	private static EmpDao empDao = new EmpDaoImpl();
	
	public static void main(String[] args) {
		
		//DAO객체를 이용해 Emp테이블 전체 조회
		List<Emp> list = empDao.selectAll();
		
		//결과 출력
		for(Emp e : list) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		//부서번호를 입력받아 조회하기
		Scanner sc = new Scanner(System.in);
		
		//부서번호 입력
		System.out.print("조회할 부서번호는? ");
		int deptno = sc.nextInt();
		
		//부서번호를 이용한 DB데이터 조회
		List<Emp> resList = empDao.selectByDeptno( deptno );
		
		//조회 결과 출력
		for(Emp e : resList) {
			System.out.println(e);
		}

		
	}
}











