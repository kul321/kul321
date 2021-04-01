package ojdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OjdbcEx_04 {
	
	//OJDBC 드라이버
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	
	//DB연결 정보
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USERNAME = "scott";
	private static final String PASSWORD = "tiger";
	
	//OJDBC 객체
	private static Connection conn = null; //DB연결객체
	
	private static Statement st = null; //SQL수행객체
	private static PreparedStatement ps = null; //SQL수행객체
	
	private static ResultSet rs = null; //조회결과객체

	
	public static void main(String[] args) {
		//--- 드라이버 로드 ---
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//---------------------
		
		
		//--- 조회할 job 입력받기 ---
		Scanner sc = new Scanner(System.in);
		System.out.print("조회할 job 입력 : ");
		String job = sc.nextLine();
		//---------------------------
		
		
		//--- SQL 작성 ---
		String sql = "";
		sql += "SELECT * FROM emp";
		sql += " WHERE job = ?";
		sql += " ORDER BY empno";
		//----------------
		
		//TEST
//		System.out.println("TEST\n" + sql);
		
		
		
		try {
			//--- DB 연결 ---
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//--------------
			
			//--- SQL 수행 객체 ---
			ps = conn.prepareStatement(sql);
			
			//SQL코드의 첫번째 ?에 job변수의 값을 넣는다
			//	-> setString()메소드는 String을 VARCHAR2로 변환하여
			//	 SQL구문에 삽입한다
			//	-> ' '작은따옴표를 자동으로 입력해준다
			ps.setString(1, job);
			
			rs = ps.executeQuery();
			//---------------------
			
			//--- 조회 결과 처리 ---
			while(rs.next()) {
				System.out.print( rs.getString("empno") + ", ");
				System.out.print( rs.getString("ename") + ", ");
				System.out.println( rs.getString("job") );
			}
			//----------------------
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				//--- 자원 해제 ---
				if(rs!=null)	rs.close();
				if(ps!=null)	ps.close();
				if(conn!=null)	conn.close();
				//-----------------
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}
	
}
















