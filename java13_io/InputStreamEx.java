package java13_io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx {
	public static void main(String[] args) {
		
		InputStream is = System.in; //Ű���� ǥ�� �Է� ��Ʈ�� ��ü
		
		byte[] buf = new byte[10]; //�Է� �������� ����� (read�� �Ű�����)
		int len = -1; //�Է¹��� �������� ���� (read�� ��ȯ������)
		
		//** len�� �⺻���� -1�� �� ����
		//	read�޼ҵ��� ��ȯ������ -1 �� EOF�� ��Ÿ���� Ư���� ������ ���δ�
		
		StringBuilder sb = new StringBuilder(); //�Է� ������ ��ü ����
		
		System.out.println("<< �Է� ����� >>>");
		try {
			//�Է� ��Ʈ���� �Է¹��� �����Ͱ� �����Ѵٸ� ��� �ݺ��Ѵ�
			while( (len = is.read(buf)) != -1 ) {
				
				//�Է��� �����͸� ����Ϳ� ����ϱ�
//				System.out.println( new String(buf, 0, len) );
				
				//�Է��� �����͸� StringBuilder�� �����ϱ�
				sb.append( new String(buf, 0, len) );
				
				//EOF�� Ű����� ���� �Է��ؾ� ����ȴ�
				//	-> ctrl + z
				//	-> ���� ctrl + d
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				is.close(); //��Ʈ�� �ݱ�, ����
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("<< �Էµ� ������ >>");
		System.out.println( sb );
		
	}
}

