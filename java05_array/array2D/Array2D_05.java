package java05_array.array2D;

public class Array2D_05 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 20;

		System.out.println("���� : " + arr.length);

		arr = new int[3];
		System.out.println("���� : "+ arr.length);
		
		//arr������ int[3]�� ���� ������� �迭������ �����ϸ鼭
		//������ �����ϰ� �ִ� int[5] �迭������ �ƹ��� �������� �ʰ� �ȴ�
		// -> �ƹ��� �������� �ʴ� �����Ҵ������ GC(Garbage Collector)�� �޸� �����Ѵ�
		// ������ �ݷ��״� JVM�ȿ� ���ԵǾ��ִ�->���α׷� �����Ű�鼭 ������ �ϴ� ��
	}

}
