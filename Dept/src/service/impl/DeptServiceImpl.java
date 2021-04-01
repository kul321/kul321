package service.impl;

import java.sql.Connection;

import common.JDBCTemplate;
import dao.face.DeptDao;
import dao.impl.DeptDaoImpl;
import dto.Dept;
import service.face.DeptService;

public class DeptServiceImpl implements DeptService {

	//DAO 객체
	private DeptDao deptDao = new DeptDaoImpl();
	
	@Override
	public Dept deptInfo(int deptno) {
		
		//Connection 객체
		Connection conn = JDBCTemplate.getConnection();
		
		//부서정보 조회
		Dept info = deptDao.selectByDeptno(conn, deptno);
		
		//조회된 부서정보 반환
		return info;
	}

	@Override
	public void register(Dept newDept) {
	
		//Connection 객체
		Connection conn = JDBCTemplate.getConnection();
		
		//신규 부서정보 삽입하기
		int res = deptDao.insertDept(conn, newDept);

		//트랜잭션 관리
		if( res > 0 ) {
			JDBCTemplate.commit(conn);//커밋
		} else {
			JDBCTemplate.rollback(conn);//롤백
		}
		
	}

}














