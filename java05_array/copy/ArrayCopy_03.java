package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		//���� ����
		//	1. ������ ������ ���� �����ϱ�
		arr2 = new int[arr1.length];
		//	2. ������ ����( SystemŬ������ �迭 ���� �޼ҵ�(���) ���)
		//		System.arraycopy ( src, srcIdx, dest, destIdx, length)
		//			src: ���� �迭
		//			srcIdx: ���� �迭���� ���簡 ���۵� �ε���
		//			dest: �纻 �迭
		//			destIdx: �纻 �迭���� ���簡 ���۵� �ε���
		//			length: ���簡 �� ����� ����
		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		
		// TEST--------------------------------
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		arr1[1] = 777;//arr1�� 1��° ��Ҹ� ������ ����
		
		System.out.println("---1��° ��Ұ� ���� ��---");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
			
		}
		
	}
}
