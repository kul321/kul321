package java05_array.quiz;

public class ArrayQuizMe_02 {
	public static void main(String[] args) {
		int[] arr = { 10, 17, 3, 9, 27, 10, 8, 9, 13, 21};//배열 선언
		
		//invert_arr 라는 거꾸로 배열
		for (int i=arr.length-1; i>=0; i--) {
			int invert_arr = arr[i];
			System.out.print(invert_arr + " ");
		}
		System.out.println();
		System.out.println("-------------");
		//arr 배열의
//		(짝수번째 인덱스 내용의 합) - (홀수번째 인덱스 내용의 합)
		//짝수번째 인덱스 합
		int eve = 0; //짝수인덱스의 합
		int odd = 0; //홀수인덱스의 합
		
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
		
//		 arr 배열의 숫자들 중 높은 숫자가 1등이 되게하여
//		 rank_arr라는 배열에 순위를 입력하시오
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

		
		

//- arr 배열의 요소들 중 중복된 값은 over_arr에 넣고 중복되지
// 않은 값은 ret_arr에 입력하시오
//	** over_arr, ret_arr은 길이가 10인 배열로 작성한다
//	
//	출력한다면 (정렬도 할 수 있으면 해도 됨)
//	=> over_arr : 9, 10
//	=> ret_arr : 3, 8, 13, 17, 21, 27
//		
		for (int i=0; i<arr.length; i++) {
			int[] over_arr = new int[arr.length];
			int[] ret_arr = new int[arr.length];
			
		}
		

		
	}
}
