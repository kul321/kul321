package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		// class File�� ������
		
		//	File(String path, String filename) - ���, ���ϸ�
		//	File(File path, String filename) - ��ΰ�ü, ���ϸ�
		
		//	File(String filepath) - ��� + ���ϸ�

		//---------------------------------------------------
		File file1 = new File(
				"C:\\study\\workspace\\JavaBasic\\src\\java13_io\\file");
		System.out.println(file1.length());
		System.out.println(file1.exists());
		
		System.out.println("----------------------");
		File file2 = new File(
				"./src/java13_io/file","Hello");
		System.out.println(file2.length());
		System.out.println(file2.exists());
	}

}
