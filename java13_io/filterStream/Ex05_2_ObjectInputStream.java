package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex05_2_ObjectInputStream {
	public static void main(String[] args) {
		
		//���� ��ü
		File file = new File("./src/java13_io/filterStream", "objectTest");

		//��Ʈ�� ��ü
		ObjectInputStream ois = null;
		
		try {
			//��Ʈ�� ��ü ����
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file) ));
			
			//��ü �Է�
			Object obj1 = ois.readObject();
			Point obj2 = (Point) ois.readObject();
			Point obj3 = (Point) ois.readObject();
			
			System.out.println(obj1);
			System.out.println(obj2);
			System.out.println(obj3);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
