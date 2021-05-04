package java05_array.sort;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {3,2,5,4,1};
		
		//---원본 출력---
		System.out.println("--- 정렬 전 ---");
		for (int i= 0; i< arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		//---------------
		
		//---버블 정렬---
		for(int j=0; j<arr.length-1; j++) {//(length-1) ROUND
			for(int i=0; i<arr.length-1; i++) {//각 ROUND
				if(arr[i]>arr[i+1]) {
					//스왑
					int tmp = arr[i];
					arr [i] = arr[i+1];
					arr [i+1] = tmp;
				}
			}		
		
			//각 ROUND 진행상황 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]+" ");
				
			}
			System.out.println();
			}
		
		//---------------
		
		//---정렬된 이후 출력 ---
		//-----------------------
		System.out.println("--- 정렬 후 ---");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
			
		} System.out.println();
		//-----------------------
	}

}
