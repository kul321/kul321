package java05_array.array2D;

public class Array2D_05 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;

		System.out.println("길이 : " + arr.length);

		arr = new int[3];
		System.out.println("길이 : "+ arr.length);
		
		//arr변수가 int[3]로 새로 만들어진 배열공간을 참조하면서
		//이전에 참조하고 있던 int[5] 배열공간은 아무도 참조하지 않게 된다
		// -> 아무도 참조하지 않는 동적할당공간을 GC(Garbage Collector)가 메모리 해제한다
		// 가비지 콜럭테는 JVM안에 포함되어있다->프로그램 실행시키면서 관리도 하는 것
	}

}
