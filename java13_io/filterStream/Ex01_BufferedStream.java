package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex01_BufferedStream {
	public static void main(String[] args) {
		
		//�Է� ��� ����
		File file = new File("./src/java13_io/filterStream", "source.txt");
		System.out.println("[TEST] exists : " + file.exists());
		
		//���� �Է� ��Ʈ�� ��ü
//		FileInputStream fis = null; //1�� ��Ʈ��
		BufferedInputStream bis = null; //2����Ʈ��, ���� ��� ������Ʈ��
		
		//���� �Է°��� ���� ����
		byte[] buf = new byte[1024]; //�Է� ������ ���� (������ ���� ����)
		int len = -1; //�Է� �������� ����
		
		
		try {
			//���� �Է� ��Ʈ�� ���� (1��, 2��)
//			fis = new FileInputStream(file);//File -> FileInputStream
//			bis = new BufferedInputStream(fis);//FileInputStream->BufferedInputStream

			bis = new BufferedInputStream( new FileInputStream(file) );
			
			//���� �Է�
			while( (len = bis.read(buf)) != -1 ) {
				System.out.print( new String(buf, 0, len) );
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close(); //��Ʈ�� �ݱ�
//				fis.close(); //��Ʈ�� �ݱ�
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}









