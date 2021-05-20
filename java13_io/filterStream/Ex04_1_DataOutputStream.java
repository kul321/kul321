package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {
	public static void main(String[] args) {
		
		//��� ���� ��ü
		File file = new File("./src/java13_io/filterStream", "dataTest.txt");
		
		//������ ��� ��Ʈ��
		DataOutputStream dos = null;
		
		try {
			//������ ��� ��Ʈ�� ����
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			//File-> FileOutputStream-> BufferedOutputStream-> DataOutputStream
			
			dos.writeBoolean(true); //1B
			dos.writeChar('��'); //2B
			dos.writeInt(123); //4B
			
			dos.flush(); //���ۺ���
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}










