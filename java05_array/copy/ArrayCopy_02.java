package java05_array.copy;

public class ArrayCopy_02 {

	public static void main(String[] args) {
		// �迭 �����ϱ� - ���� ����
		int[] arr1 = {10,20,30};//����,Source
		int[] arr2; //�纻, Destination
		
		//--- ���� ����, Deep Copy ---
		// 	 ���� ����� ���빰(Heap�޸𸮰���)�� ���ο� ������ �����ϴ� ��
		//----------------------------
		
		
		//	 ������������ �и��� ��������� ������ �ȴ�
		//----------------------------
		
		//	 1. ����� ������ ���� �����Ѵ�
		arr2 = new int[arr1.length];//<-arr2�� �ڱ� ȥ�� ����� ������ ���� �������
		
		
		//   2. �����͸� �����Ѵ� (for�� �̿�)
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i]; // �纻<- ���� �ϳ��ϳ� ��������
		}
		
		
		//  -------------------test
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
