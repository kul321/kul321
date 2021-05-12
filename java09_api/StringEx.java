package java09_api;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "Apple"; //���ͷ� ��� "Apple"�� ������ ����
		String str2 = new String("Banana"); //���� ������ "Banana" ������ ����
		
		System.out.println("----- length() -----");
		System.out.println("str1�� ���� : "+str1.length());//5
		System.out.println("str2�� ���� : "+str2.length());//6
		
		System.out.println("Cherry�� ���� : "+"Cherry".length());//6
		
		System.out.println("\n---- equals() ------");
		System.out.println("str1�� str2 �� : "+str1.equals(str2));//false
		
		System.out.println("Banana�� str2 �� : " + "Banana".equals(str2)); //true
		System.out.println("Banana == str2 : "+ ("Banana" == str2));//false
		
		//	���ڿ� ���� ������ ����񱳸� �ؾ��Ѵ�
		//	-> equals() ���
		
		//	== �����ڸ� �̿��Ͽ� ���Ϻ񱳸� �ϸ� �߸��� ����� ���� �� �ִ�
		
		System.out.println("\n---toLowerCase()---");
		//���ڿ��� ��� ���ĺ��� �ҹ��ڷ� ������ ����� ��ȯ
		
		String lower = str1.toLowerCase();
		System.out.println("str1: "+str1);
		System.out.println("lower: "+ lower);
		
		System.out.println("\n---toUpperCase()---");
		//���ڿ��� ��� ���ĺ��� �빮�ڷ� ������ ����� ��ȯ
		
		String upper = str1.toUpperCase();
		
		System.out.println("str1: " + str1);
		System.out.println("upper: "+ upper);
		
		System.out.println("\n----chatAt()------");
		//���ڿ��� Ư�� �ε����� ����(char)�� ��ȯ�Ѵ�
		
		char ch  = "Hello Java".charAt(6);//6��° �ε��� -> 7��° ����
		System.out.println( ch );
		
		System.out.println("\n----concat()-----");
		//���ڿ��� ���ڿ��� �����Ͽ� ��ȯ�Ѵ�
		
		String concat = str1.concat(", HIHIHI");
		System.out.println("str1: "+ str1);
		System.out.println("concat: "+ concat);
		
		
		System.out.println("\n-----replace-----");
		//������ ����(char)�� �ٸ� ����(char)�� ��ȯ�Ͽ� ��ȯ�Ѵ�
		
		String replace1 = str1.replace('A','a');
		System.out.println("str1: "+str1);
		System.out.println("replace1: "+replace1);
		
		//�ٲٷ��� ���ڰ� ���� ���� ��� ��ȯ��
		String replace2 = str1.replace('p', 'T');
		System.out.println("str1: " + str1);
		System.out.println("replace2: "+replace2);
		
		System.out.println("\n-----replace-----");
		
		//������ ���ڿ�(CharSequence)�� �ٸ� ���ڿ�(CharSequence)�� ��ȯ
		//	->String�� interface CharSequence�� �ڽ�Ŭ����
		
		String replace3 = str1.replace("ple", "PLE");
		System.out.println(str1);
		System.out.println("replace3: " + replace3);
		
		System.out.println("\n---contains()---");
		//Ư�� ���ڿ��� �����ϰ� �ִ��� �˻�
		
		boolean res1 = "Hello Java, Welcome".contains("Java");
		System.out.println(res1); //true
		
		boolean res2 = str1.contains("PP");
		System.out.println(res2); //false, ��ҹ��ڱ��� �¾ƾ���
		
		System.out.println("\n----substring----");
		//���ڿ��� �Ϻκ��� �����Ͽ� ��ȯ
		
		String substr = str1.substring(2);//2��° �ε������� ������
		System.out.println(substr);//"ple"
		
		String substr2 = str1.substring(1, 3);//1��° �ε������� 3��° �ε������� ��ȯ
		System.out.println(substr2);// "pp"
		
	}
}
