package java13_io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
		
		//����� ���� ��Ʈ��
		BufferedReader in = new BufferedReader(
				new InputStreamReader(System.in)); //Ű���� �Է�
		
		PrintWriter out = new PrintWriter(
				new BufferedWriter(
						new OutputStreamWriter(System.out)), true ); //����� ���
		//** PrintWriter�� �����ڿ��� autoFlush ������ ���� �� �ִ�
		//	print, println, printf �޼ҵ�� ����ϸ� �ڵ� flush
		
//		in.readLine(); //�Է� �޼ҵ�
//		out.println(); //��� �޼ҵ�

		String str = null; //�Է¹��� ���ڿ�
		
		try {
			while( (str=in.readLine()) != null ) {
				out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close(); //��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			out.close(); //��Ʈ�� �ݱ�, PrintWriter�� try-catch���ص� ��
		}
		
	}
}















