package java05_array.quiz;

public class ArrayQuizMe_02 {
	public static void main(String[] args) {
		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21};//�迭 ����
		
		//invert_arr ��� �Ųٷ� �迭
		for (int i=arr.length-1; i>=0; i--) {
			int invert_arr = arr[i];
			System.out.print(invert_arr + " ");
		}
		System.out.println();
		System.out.println("-------------");
		//arr �迭��
//		(¦����° �ε��� ������ ��) - (Ȧ����° �ε��� ������ ��)
		//¦����° �ε��� ��
		int eve = 0; //¦���ε����� ��
		int odd = 0; //Ȧ���ε����� ��
		
		for (int i=0; i<10; i++) {
			if(i%2==0) {
				eve += arr[i];
			} else {
				odd += arr[i];
			}
				
				System.out.print(eve - odd);
			}
		System.out.println();
		System.out.println("-------------");
		
//		 arr �迭�� ���ڵ� �� ���� ���ڰ� 1���� �ǰ��Ͽ�
//		 rank_arr��� �迭�� ������ �Է��Ͻÿ�
//			=> arr :     { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21 }
//		    => rank_arr :{  5,  3, 10,7,  1,  5, 9, 7,  4,  2 }

		for ( int i=0; i<arr.length; i++) {
			int[] rank = new int[arr.length];
			int count = 0;
			for(int j=0; j<arr.length; j++) {
				if (arr[j]>arr[i]) {
					count++;
				}
			rank[i] = count +1;
			
			} System.out.print(rank[i]+ " ");
		} System.out.println();
		System.out.println("-----------------------");

		
		

//- arr �迭�� ��ҵ� �� �ߺ��� ���� over_arr�� �ְ� �ߺ�����
// ���� ���� ret_arr�� �Է��Ͻÿ�
//	** over_arr, ret_arr�� ���̰� 10�� �迭�� �ۼ��Ѵ�
//	
//	����Ѵٸ� (���ĵ� �� �� ������ �ص� ��)
//	=> over_arr : 9, 10
//	=> ret_arr : 3, 8, 13, 17, 21, 27
//		
		for (int i=0; i<arr.length; i++) {
			int[] over_arr = new int[arr.length];
			int[] ret_arr = new int[arr.length];
			
		}
		

		
	}
}
