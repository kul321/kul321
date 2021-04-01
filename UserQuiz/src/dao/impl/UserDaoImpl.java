package dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.face.UserDao;
import dto.User;

public class UserDaoImpl implements UserDao {

	//OJDBC 드라이버
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//DB연결 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	//OJDBC 객체
	private static Connection conn = null; //DB연결객체
	private static PreparedStatement ps = null; //SQL수행객체
	private static ResultSet rs = null; //조회결과객체
	
	
	//생성자
	public UserDaoImpl() {
		try {
			//--- 드라이버 로드 ---
			Class.forName(DRIVER);
			
			//--- DB 연결 ---
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public List<User> selectAll() {
//		System.out.println("UserDaoImpl - selectAll() 호출");
		
		
		//--- SQL 작성 ---
		String sql = "";
		sql += "SELECT * FROM userTest"; 
		sql += " ORDER BY idx";
		
		
		//--- SQL수행 결과를 저장할 List ---
		List<User> userList = new ArrayList<>();
		
		
		try {
			//--- SQL 수행 ---
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
			
			//--- 결과 처리 ---
			while( rs.next() ) { //결과값을 한 행씩 마지막까지 반복
				User user = new User(); //비어있는 User DTO객체
				
				//한 행의 정보를 User DTO객체에 저장하기
				user.setIdx( rs.getInt("idx") );
				user.setUserid( rs.getString("userid") );
				user.setName( rs.getString("name") );
				
				//행의 정보를 List에 삽입
				userList.add( user );
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//--- 자원 해제 ---
				if(rs!=null)	rs.close();
				if(ps!=null)	ps.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		//--- 최종 결과 리턴 ---
		return userList;
	}


	@Override
	public void insertUser(User insertUser) {
//		System.out.println("UserDaoImpl - insertUser() 호출");
//		System.out.println( insertUser );
		
		
		//--- SQL 작성 ---
		String sql = "";
		sql += "INSERT INTO userTest( idx, userid, name )";
		sql += " VALUES (userTest_SQ.nextval, ?, ?)";

		
		try {
			//--- SQL 수행 객체 ---
			ps = conn.prepareStatement(sql);
			
			
			//--- SQL의 ? 채우기 ---
			ps.setString(1, insertUser.getUserid());
			ps.setString(2, insertUser.getName());
			
			
			//--- SQL 수행 ---
			ps.executeUpdate();
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//--- 자원 해제 ---
				if(ps!=null)	ps.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}


	@Override
	public User selectByIdx(int idx) {
//		System.out.println("UserDaoImpl - selectByIdx() 호출");
//		System.out.println( idx );
		
		
		//--- SQL 작성 ---
		String sql = "";
		sql += "SELECT * FROM userTest";
		sql += " WHERE idx = ?";
		
		
		//--- 조회된 결과를 저장할 DTO객체 ---
		User user = null;
		
		
		try {
			//--- SQL 수행 객체 ---
			ps = conn.prepareStatement(sql);
			
			//--- SQL의 ? 채우기 ---
			ps.setInt(1, idx);
			
			//--- SQL 수행 ---
			rs = ps.executeQuery();
			
			
			//--- SQL 수행 결과 처리 ---
			if( rs.next() ) { //조회 결과의 첫 번째 행을 참조하게 만든다
				
				user = new User();
				
				user.setIdx( rs.getInt("idx") );
				user.setUserid( rs.getString("userid") );
				user.setName( rs.getString("name") );
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//--- 자원 해제 ---
				if(rs!=null)	rs.close();
				if(ps!=null)	ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		

		//--- 최종결과 반환 ---
		return user;
	}


	@Override
	public void deleteByIdx(int idx) {
		
		//--- SQL 작성 ---
		String sql = "";
		sql += "DELETE userTest";
		sql += " WHERE idx = ?";

		
		try {
			//--- SQL 수행 객체 ---
			ps = conn.prepareStatement(sql);
			
			//--- SQL의 ? 채우기 ---
			ps.setInt(1, idx);
			
			//--- SQL 수행 ---
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//--- 자원 해제 ---
				if(ps!=null)	ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}













