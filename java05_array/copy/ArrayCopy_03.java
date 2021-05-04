package java05_array.copy;

public class ArrayCopy_03 {
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		int[] arr2;
		
		//깊은 복사
		//	1. 복사할 공간을 새로 생성하기
		arr2 = new int[arr1.length];
		//	2. 데이터 복사( System클래스의 배열 복사 메소드(기능) 사용)
		//		System.arraycopy ( src, srcIdx, dest, destIdx, length)
		//			src: 원본 배열
		//			srcIdx: 원본 배열에서 복사가 시작될 인덱스
		//			dest: 사본 배열
		//			destIdx: 사본 배열에서 복사가 시작될 인덱스
		//			length: 복사가 될 요소의 개수
		
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		
		// TEST--------------------------------
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
		}
		arr1[1] = 777;//arr1의 1번째 요소만 데이터 변경
		
		System.out.println("---1번째 요소값 변경 후---");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr1[i]+" : "+arr2[i]);
			
		}
		
	}
}
