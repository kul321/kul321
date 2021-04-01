package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import common.JDBCTemplate;
import dao.face.DeptDao;
import dto.Dept;

public class DeptDaoImpl implements DeptDao {

	@Override
	public Dept selectByDeptno(Connection conn, int deptno) {
		
		PreparedStatement ps = null; //SQL수행 객체
		ResultSet rs = null; //SQL조회결과 객체
		
		//SQL 작성
		String sql = "";
		sql += "SELECT * FROM dept";
		sql += " WHERE deptno = ?";
		
		//쿼리 수행 결과 저장 객체
		Dept dept = null;
		
		try {
			//쿼리 수행 객체 생성
			ps = conn.prepareStatement(sql);
			ps.setInt(1, deptno);
			
			//쿼리 수행
			rs = ps.executeQuery();
			
			//결과 처리
			if( rs.next() ) {
				dept = new Dept();
				
				dept.setDeptno( rs.getInt("deptno") );
				dept.setDname( rs.getString("dname") );
				dept.setLoc( rs.getString("loc") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//자원해제
			JDBCTemplate.close(rs);
			JDBCTemplate.close(ps);
		}
		
		//조회결과 반환
		return dept;
	}

	@Override
	public int insertDept(Connection conn, Dept newDept) {
		
		//SQL 수행 객체
		PreparedStatement ps = null;
		
		//SQL 쿼리
		String sql = "";
		sql += "INSERT INTO dept( deptno, dname, loc )";
		sql += " VALUES ( ?, ?, ? )";
		
		//영향받은 행의 수
		int res = 0;
		
		try {
			//SQL 수행 객체 처리
			ps = conn.prepareStatement(sql);
			ps.setInt(1, newDept.getDeptno());
			ps.setString(2, newDept.getDname());
			ps.setString(3, newDept.getLoc());
			
			//SQL 수행
			res = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//자원 해제
			JDBCTemplate.close(ps);
		}
		
		//영향받은 행의 수 반환
		return res;
	}

}














