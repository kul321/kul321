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



public class UserDaoImpl implements UserDao{
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
						//------------------
						
						//--- DB 연결 ----
						conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
						//-------------------
						
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					} catch (SQLException e) {
						e.printStackTrace();
					}//try catch end
				}//UserDaoImpl() end

		@Override
		public List<User> selectAll() {
			//--- SQL 작성 ---
			String sql = "";
			sql += "SELECT * FROM usertest";
			sql += " ORDER BY idx";
			//----------------
			
			//--- 조회 결과를 저장할 List ---
			List<User> userlist = new ArrayList<>();
			//-------------------------------
			
			
			try {
				//--- SQL 수행 객체 생성 ---
				ps = conn.prepareStatement(sql);
				//--------------------------

				//--- SQL 수행 및 결과 저장 ---
				rs = ps.executeQuery();
				//-----------------------------
				
				//--- 조회 결과 처리 ---
				while(rs.next()) { //결과값을 한 행씩 마지막까지 반복
					
					//각 행의 데이터를 저장할 User객체 생성
					User user = new User(); //비어있는 User DTO객체
					
					//한 행의 정보를 User DTO객체에 저장하기
					user.setIdx( rs.getInt("idx"));
					user.setUserid(rs.getString("userid") ); 
					user.setName(rs.getString("name") );
					
					//조회결과를 담고있는 User객체를 리스트에 추가하기
					userlist.add(user);
				}
				//----------------------
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					//--- 자원 해제 ---
					if(rs!=null)	rs.close();
					if(ps!=null)	ps.close();
					//-----------------
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			//--- 최종 조회 결과 반환 ---
			return userlist;
			//---------------------------
		}//selectAll() end

		@Override
		public void insertUser(User insertUser) {
//			System.out.println("UserDaoImpl - insertUser() 호출"); 확인용
//			System.out.println( insertUser ); 확인용
			
			//--- SQL 작성 ---
			String sql = "";
			sql += "INSERT INTO usertest ( idx, userid, name )";
			sql += " VALUES ( userTest_SQ.nextval, ?, ? )";
			//----------------
			
			//---- SQL 수행 ---
			try {
				//--- SQL 수행 객체 생성 ---
				ps = conn.prepareStatement(sql);
				//--------------------------
				//--- SQL의 ? 채우기 ---
				ps.setString(1, insertUser.getUserid());//''작은따옴표는 자동처리됨
				ps.setString(2, insertUser.getName());
				
				//--- SQL 수행 및 결과 저장 ---
				ps.executeUpdate();
				//-----------------------------
				
				//--- 조회 결과 처리 ---
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					//--- 자원 해제 ---
					
					if(ps!=null)	ps.close();
					//-----------------
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
			
		} // insert end

		@Override
		public User selectByIdx(int idx) {
//			System.out.println("UserDaoImpl - selectByIdx() 호출"); 확인용
//			System.out.println( idx ); 확인용
			
			// --- SQL 작성 ---
			String sql = "";
			sql += "SELECT * FROM usertest";
			sql += " WHERE idx = ?";
			
			//--- 조회된 결과를 저장할 DTO객체---
			User user = null;
			
			try {
				// --- SQL 수행 객체 --
				ps = conn.prepareStatement(sql);
				
				// --- SQL의 ? 채우기 ---
				ps.setInt(1, idx);
				// --- SQL 수행 ---
				rs = ps.executeQuery();
				// --- SQL 수행 결과 처리 ---
				if(rs.next() ) { //조회 결과의 첫 번째 행을 참조하게 만든다
				
					user = new User();
					user.setIdx(rs.getInt("idx"));
					user.setUserid(rs.getString("userid"));
					user.setName(rs.getString("name"));
				} //if문 end 
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();} finally {
						try {
							if(rs!=null)	rs.close();
							if(ps!=null)	ps.close();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			}//ps = conn.prepareStatement try catch end


			
			//--- 최종결과 반환 ---
			return user;
		}// selectByIdx(int idx) end

		@Override
		public void deleteByIdx(int idx) {
			// --- SQL 작성 ---
			String sql = "";
			sql += "DELETE userTest";
			sql += " WHERE idx = ?";
			//---------------------------
			try {
				// --- SQL 수행 객체 ---
				ps = conn.prepareStatement(sql);
				
				//--- SQL에 ? 채우기 ---
				ps.setInt(1, idx);
				// --- SQL 수행 ---
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
					try {
						if(ps!=null)	ps.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}// finally try catch end
		}//deleteByIdx(int idx) end
}//UserDaoImpl class end
