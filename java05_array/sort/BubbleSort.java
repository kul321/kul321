package java05_array.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,4,1};
		
		//---���� ���---
		System.out.println("--- ���� �� ---");
		for (int i= 0; i< arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		//---------------
		
		//---���� ����---
		for(int j=0; j<arr.length-1; j++) {//(length-1) ROUND
			for(int i=0; i<arr.length-1; i++) {//�� ROUND
				if(arr[i]>arr[i+1]) {
					//����
					int tmp = arr[i];
					arr [i] = arr[i+1];
					arr [i+1] = tmp;
				}
			}		
		
			//�� ROUND �����Ȳ ���
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
				
			}
			System.out.println();
			}
		
		//---------------
		
		//---���ĵ� ���� ��� ---
		//-----------------------
		System.out.println("--- ���� �� ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		} System.out.println();
		//-----------------------
	}

}
