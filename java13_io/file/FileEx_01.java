package java13_io.file;

import java.io.File;

public class FileEx_01 {

	public static void main(String[] args) {
		//class File
		//	������ ������ �����ϴ� Ŭ����
		
		//	-> ��������¿��� ����´������ ������ �� �ְ� ���ش�
		
		//��θ� ������ �� ������ ��Ÿ���� ����
		// "\\" �������� 2��
		// "/
		File file = new File("C:\\Users\\k\\Documents\\test.txt");
		
		System.out.println("file info : "+file);//���+���ϸ�
		System.out.println("length : "+file.length());//����ũ��
		System.out.println("exists : "+file.exists());//������ ���� ����
	}

}
