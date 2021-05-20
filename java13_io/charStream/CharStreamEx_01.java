package java13_io.charStream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {

	public static void main(String[] args) {
		// ���� ��Ʈ��, Character Stream
		//	����(char, 2B)������ ����ϴ� ��Ʈ��
		
		//	�⺻ ��Ʈ���� 1B������ ����ϱ� ������
		//	����Ʈ ��Ʈ��->���ڽ�Ʈ������ ��ȯ�ؼ� ����Ѵ�
		
		//	InputStreamReader: 
		//		InputStream(����Ʈ��Ʈ��) -> Reader(���ڽ�Ʈ��)
		//	OutputStreamWriter: 
		//		OutputStream(����Ʈ��Ʈ��) -> Writer(���ڽ�Ʈ��)
		
		//-------------------------------------------------------
		
		//���ڽ�Ʈ���� �̿��Ͽ� Ű���� �Է��� ����� ������� ��������
		
		Reader reader = new InputStreamReader(System.in); //�Է½�Ʈ��
		Writer writer = new OutputStreamWriter(System.out); //��½�Ʈ��
		//��Ʈ�� ���� ����
		char[] cbuf = new char[1024];//�ӽ� �����(����)
		int len = -1; //�Է��� �������� ����
		
		try {
			while ( ( len = reader.read(cbuf)) !=-1){
				writer.write(cbuf,0,len);//�Է��� ������ ���
				writer.flush();//���� ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
				reader.close();//��Ʈ�� �ݱ�
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
