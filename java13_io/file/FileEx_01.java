package java13_io.file;

import java.io.File;

public class FileEx_01 {

	public static void main(String[] args) {
		//class File
		//	파일의 정보를 관리하는 클래스
		
		//	-> 파일입출력에서 입출력대상으로 지정할 수 있게 해준다
		
		//경로를 지정할 때 폴더를 나타내는 문자
		// "\\" 역슬래시 2번
		// "/
		File file = new File("C:\\Users\\k\\Documents\\test.txt");
		
		System.out.println("file info : "+file);//경로+파일명
		System.out.println("length : "+file.length());//파일크기
		System.out.println("exists : "+file.exists());//파일의 존재 유무
	}

}
