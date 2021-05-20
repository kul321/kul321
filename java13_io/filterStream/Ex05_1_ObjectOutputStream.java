package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Ex05_1_ObjectOutputStream {
	public static void main(String[] args) {
		
		//���� ��ü
		File file = new File("./src/java13_io/filterStream", "objectTest");
	
		//��Ʈ�� ��ü
		ObjectOutputStream oos = null;
		
		try {
			//��Ʈ�� ����
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file) ));
			
			//��µ� ������ ��ü
			Point p1 = new Point(11, 22);
			Point p2 = new Point(111, 222);
			Point p3 = new Point(1111, 2222);
			
			//��ü ���
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
			oos.flush(); //���� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}













