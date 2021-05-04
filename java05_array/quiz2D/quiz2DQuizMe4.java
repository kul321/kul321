package java05_array.quiz2D;

public class quiz2DQuizMe4 {
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		int k = 1; //
		
		//----- 입력(여기를 고쳐서 해결할 것!)-----
		for (int j = 4; j >=0; j--) {
			for (int i = 0; i<arr.length; i++) {//i행
				arr[i][j] = k++;
				
				
			}	
		}
		
		
		
		//-------출력 (그대로 둘 것!)-------
		for (int i = 0; i < arr.length; i++) {//i행
			for (int j = 0; j < arr[i].length; j++) {//j열
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
