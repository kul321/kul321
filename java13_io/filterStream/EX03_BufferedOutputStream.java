package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX03_BufferedOutputStream {
	public static void main(String[] args) {
		
		//��� ��� ����
		File file = new File("./src/java13_io/filterStream","bufferedOut.txt");
		
		//���� ��� ��Ʈ�� ��ü
		FileOutputStream fos = null; //1�� ��Ʈ��
		BufferedOutputStream bos = null; //2�� ��Ʈ��, ���� ��� ���� ��Ʈ��
		
		try {
			//���� ��� ��Ʈ�� ����
//			fos = new FileOutputStream(file); //������(������ ÷���� �ۼ�)
			fos = new FileOutputStream(file, true); //�߰����(������ ������ �ۼ�)
			bos = new BufferedOutputStream(fos);
			
			String data = "Cherry";
			bos.write(data.getBytes(),0,data.length());
			bos.flush();//��� ���� ����
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();//��Ʈ�� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
