package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_2_DataInputStream {
	public static void main(String[] args) {
		
		//��� ���� ��ü
		File file = new File("./src/java13_io/filterStream", "dataTest.txt");

		//������ �Է� ��Ʈ��
		DataInputStream dis = null;
		
		try {
			//������ �Է� ��Ʈ�� ����
			dis = new DataInputStream(
					new BufferedInputStream(
							new FileInputStream(file) ));
			
			boolean data1 = dis.readBoolean();
			char data2 = dis.readChar();
			int data3 = dis.readInt();
			
			System.out.println(data1 + ", " + data2 + ", " + data3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close(); //��Ʈ�� �ݱ�
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}









