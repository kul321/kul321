package java05_array;

public class Array_03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		// �迭�� ��� ����, �迭�� ����, �迭�� ũ��
		System.out.println("�迭�� ����: " + arr.length);
		
		//�迭�� ���̸� �̿��� �迭 ��ü ���
		for(int i=0; i<arr.length; i++) {//i, 0~5, x5
			System.out.println(i);
		}
		//-----------------------------------
		//arr�� �ε���:0~5, 0~ length-1, 0~����-1
		
		
//		int[] arr2 = new int[-10];//NegativeArraySizeException
		//�迭�� ũ�⸦ ������ �����Ͽ� �����Ϸ��� �� �� �߻�
		
//		arr[-5] = 100;
		//ArrayIndexOutofBoundsException
		//0���� ���� �ε����� �����ؼ� �߻��Ѵ�
		//->NegativeArraySizeException�� �򰥸��� ����
		
	}

}
