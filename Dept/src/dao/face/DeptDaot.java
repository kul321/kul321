package dao.face;

import java.sql.Connection;

import dto.Dept;

public interface DeptDao {

	/**
	 * 주어진 부서번호를 이용해 해당 부서의 정보를 조회한다
	 * 
	 * @param conn - DB연결 객체
	 * @param deptno - 조회할 부서번호
	 * @return 조회된 부서 정보 DTO객체, 없으면 null
	 */
	public Dept selectByDeptno(Connection conn, int deptno);
	
	/**
	 * 전달받은 객체를 이용하여 부서 정보를 삽입한다
	 * 
	 * @param conn - DB연결 객체
	 * @param newDept - 새로 삽입할 부서 정보 객체
	 * @return
	 * 	0 - INSERT 코드 수행 실패
	 * 	1 - INSERT 코드 수행 성공 
	 */
	public int insertDept(Connection conn, Dept newDept);
	
}









