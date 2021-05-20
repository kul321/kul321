package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		//�Է� ��� ���� ��ü
		File file = new File("./src/java13_io/fileStream","input");
		System.out.println("[TEST] exists :" +file.exists());
		
		//���� �Է� ����
		byte[] buf = new byte[1024];//�Է� ������ ����
		int len = -1; //�Էµ� �������� ����
		StringBuilder sb = new StringBuilder();//������ �����
		
		FileInputStream fis = null; //���� �Է� ��Ʈ�� ��ü
		try {
			fis = new FileInputStream(file);//���� �Է� ��Ʈ�� ����
			
			while((len=fis.read(buf)) != -1) {
				//System.out.println("�߰�����>> "+new String(buf,0,len));
				sb.append(new String(buf,0,len));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();//��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("<<�Էµ� ������>>");
		System.out.println(sb);
	}

}
