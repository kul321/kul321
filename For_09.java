package java04_control.loop;

public class For_09 {
	public static void main(String[] args) {
		//for�� ��ø, 2�� for��
		//	�ٱ��� loop�� �ݺ��Ǵ� ������ ���࿡ ����
		//	���� loop�� �ݺ��Ǵ� ������ ����Ǵ� ������ ����ؾ��Ѵ�
		for(int i=0; i<3; i++) {//i, 0~2, 3��
			for(int j=0; j<3; j++) {//j, 0~2, 3��
				System.out.println("i:"+i+",j:"+j);
			}
			System.out.println("---------");
		}
		
	}
}
