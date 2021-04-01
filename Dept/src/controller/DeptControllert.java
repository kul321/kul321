package controller;

import java.util.Scanner;

import dto.Dept;
import service.face.DeptService;
import service.impl.DeptServiceImpl;

public class DeptController {
	
	//서비스 객체
	private static DeptService deptService = new DeptServiceImpl();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//--- 부서번호를 입력받아 부서정보 조회 ---
		System.out.print("조회할 부서는? ");
		int deptno = sc.nextInt();
		
		//부서정보 조회
		Dept info = deptService.deptInfo(deptno);
		System.out.println(info);
		
		
		
		//--- 신규 부서정보 삽입하기 ---
		System.out.println("\n--- 새로운 부서정보 삽입 ---");
		
		Dept newDept = new Dept();
		
		System.out.print("부서번호? ");
		newDept.setDeptno( sc.nextInt() );
		
		System.out.print("부서이름? ");
		sc.nextLine();
		newDept.setDname( sc.nextLine() );
		
		System.out.print("부서위치? ");
		newDept.setLoc( sc.nextLine() );
		
		//신규 부서 등록
		deptService.register(newDept);
		
		
		//--- 삽입한 부서 확인 ---
		//	삽입에 사용한 newDept 객체의 deptno 이용하기
		
		Dept insertResult = deptService.deptInfo(newDept.getDeptno());
		
		System.out.println(">>삽입된 부서 : " + insertResult);
		
	}
}
















