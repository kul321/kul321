package dao;

import java.util.List;

import dto.Emp;

public interface EmpDao {

	//테이블 전체 조회
	public List<Emp> selectAll();
	
}
