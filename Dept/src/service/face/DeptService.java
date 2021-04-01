package service.face;

import dto.Dept;

public interface DeptService {

	/**
	 * 부서 정보 조회하기
	 * 주어진 부서번호를 이용하여 부서정보를 조회하고 DTO객체로 반환한다
	 * 
	 * @param deptno - 조회할 부서번호
	 * @return 조회된 부서정보를 저장한 객체, 없으면 null
	 */
	public Dept deptInfo(int deptno);
	
	/**
	 * 신규 부서 입력
	 * 
	 * @param newDept - 등록한 신규 부서 정보 객체
	 */
	public void register(Dept newDept);
	
}


















