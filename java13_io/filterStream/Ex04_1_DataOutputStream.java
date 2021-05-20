package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {
	public static void main(String[] args) {
		
		//출력 파일 객체
		File file = new File("./src/java13_io/filterStream", "dataTest.txt");
		
		//데이터 출력 스트림
		DataOutputStream dos = null;
		
		try {
			//데이터 출력 스트림 생성
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			//File-> FileOutputStream-> BufferedOutputStream-> DataOutputStream
			
			dos.writeBoolean(true); //1B
			dos.writeChar('가'); //2B
			dos.writeInt(123); //4B
			
			dos.flush(); //버퍼비우기
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close(); //스트림 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}










