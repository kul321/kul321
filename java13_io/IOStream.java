package java13_io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IOStream {

	public static void main(String[] args) {
		// Ű���� �Է� -> ���α׷� -> ����� ���
		
		InputStream is = System.in; //ǥ�� �Է� ��Ʈ��
		OutputStream os = System.out;//ǥ�� ��� ��Ʈ��
		
		byte[] buf = new byte[1024];//����� ������ �ӽ� �����
		int len = -1; //�Է� �������� ����
		
		try {
			//EOF�� ���� ������ Ű������ �Է��� �޴´�
			while((len=is.read(buf))!=-1) {
				
				//�Է¹��� �����͸� ����ͷ� ����Ѵ�
				os.write(buf, 0, len);
				os.flush();//��½�Ʈ���� ���� ����
				
			}
			is.read(buf);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close(); //�Է½�Ʈ�� �ݱ�
				os.close(); //��½�Ʈ�� �ݱ�
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
