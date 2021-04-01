package ex;

import java.util.List;

import dao.face.UserDao;
import dao.impl.UserDaoImpl;
import dto.User;

public class UserEx {
	
	// DAO 생성
	private static UserDao userDao = new UserDaoImpl(); // 동작되도록 바꾸세요!!

	public static void main(String[] args) { //시작점
		
		//--- 전체 출력 ---
//		List<User> list = userDao.selectAll();
//		
//		for(User u : list) {
//			System.out.println(u);
//		}
		//-----------------

		
		
		//--- 유저 삽입 ---
		// 유저 객체를 생성하고
		// 유저 정보를 객체에 입력하고
		//DB에 삽입되도록 구현하세요!!
		
		//	userId : A123
		//	name : Alice
		//-----------------
		
//		//비어있는 User DTO 객체 생성
//		User insertUser = new User();
//		
//		//유저 정보 입력
//		insertUser.setUserid( "A123" );
//		insertUser.setName( "Alice" );
//		
//		//유저 정보 DB삽입
//		userDao.insertUser(insertUser);
		
		//-----------------
		
		
		
		//--- 유저 조회 ---
//		User selectUser = userDao.selectByIdx(20);
//		User selectUser = userDao.selectByIdx(1000); //null
//		System.out.println(selectUser);
		//-----------------
		
		
		
		//--- 유저 삭제 ---
		userDao.deleteByIdx(20);
				
		// 유저 조회 - 삭제됐는지 확인하는 용도(null나와야함)
		User resultUser = userDao.selectByIdx(20);
		System.out.println(resultUser);
		//-----------------
		
	}
	
}











