package java05_array;

public class Array_03 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		// 배열의 요소 개수, 배열의 길이, 배열의 크기
		System.out.println("배열의 길이: " + arr.length);
		
		//배열의 길이를 이용한 배열 전체 출력
		for(int i=0; i<arr.length; i++) {//i, 0~5, x5
			System.out.println(i);
		}
		//-----------------------------------
		//arr의 인덱스:0~5, 0~ length-1, 0~길이-1
		
		
//		int[] arr2 = new int[-10];//NegativeArraySizeException
		//배열의 크기를 음수로 지정하여 생성하려고 할 때 발생
		
//		arr[-5] = 100;
		//ArrayIndexOutofBoundsException
		//0보다 작은 인덱스로 접근해서 발생한다
		//->NegativeArraySizeException와 헷갈리지 말것
		
	}

}
