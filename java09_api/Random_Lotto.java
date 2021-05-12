package java09_api;

import java.util.Arrays;
import java.util.Random;

public class Random_Lotto {
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] arr = new int[6];
		
		//��ü 6�� ���� �����ϱ� - �ζ� ���� �����
		for(int i=0; i<arr.length; i++) {
			
			int num = ran.nextInt(45)+1; //1~45

			//�̹� ����ִ� �� �߿� �ߺ����� ������ �ٽ� ���� ���� �ʿ�
			boolean isExists = false; //�ߺ��� ����(false: ����, true: ����)
			
			//������ �������� �߿� �����ϴ� ������ �˻�
			for(int j=0; j<i; j++) {
				
				if(arr[j] == num) { //�����ϴ� ���� ���
					isExists = true; //�ߺ����̶�� ǥ���صα�
					break; //�ߴ�
				}
			}
			
			if( isExists ) {
				//�����ϴ� ���̶�� �������� �� ���� �ʰ�
				//�ݺ�Ƚ�� �ѹ� �߰�
				i--;
				continue;
			}
			
			//�������� �ʴ� ���̸� ���������� �迭�� ����
			arr[i] = num;
		}
		
		System.out.println( Arrays.toString(arr) );
		
		Arrays.sort(arr); //�迭 ����
		
		System.out.println( Arrays.toString(arr) );
	}
}
