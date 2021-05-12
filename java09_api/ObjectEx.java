package java09_api;

import java.util.Arrays;

//���� �ۼ����� �ʾƵ� ObjectŬ������ ��ӹް� �ִ�
class Point implements Cloneable{//�������̽� Cloneable�� ������ ������ ������ ���� �߻�
	int x; //x��ǥ
	int y; //y��ǥ
	
	public Point(int x, int y) {
		this.x= x;
		this.y= y;	
	}
	
	@Override
	public String toString() {
		return "("+ x +", "+y+")";
	}	
	
	@Override
	public boolean equals(Object obj) {
		// p2.equals(p3)
		
		//this�ڱ�������ü -> �ڱ��ڽ�, p2
		//obj�Ű����� -> �񱳴��, p3
		
		if( this.x == ((Point)obj).x && this.y == ((Point)obj).y) {
			return true; //�����ϴ�, equal to
		} else {
			return false; //�������� �ʴ�, non equal to
		}
		
		
	}
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class ObjectEx {
	public static void main(String[] args) {
		 Object obj = new Object();
		 Point p1 = new Point(10,20);
		 
		 //��ü������ ����ϸ� �������� ���
		 System.out.println(obj);
		 System.out.println(p1);
		
		 System.out.println("---toString()---");
		 
		 //System.out.println( ��ü���� )�� ����ϸ�
		 //��ü������ toString() �޼ҵ带 ȣ���� ����� ����Ѵ�
		 
		 System.out.println(obj.toString());
		 System.out.println(p1.toString());
		 
		 System.out.println("\n---equals()----");
		 Point p2 = new Point(11,22);
		 Point p3 = new Point(11,22);
		 Point p4 = p2; //���� ����
		 
		 System.out.println("p2 : "+p2);
		 System.out.println("p2 : "+p3);
		 System.out.println("p2 : "+p4);
		 
		 //==������ ��(���ϼ�identity ��) 
		 //	->���� ��ü���� �˻��Ѵ�
		 // ->������(�ּ�)�� ���Ѵ� -> ���� ���� ����Ǿ��ִ��� �˻�
		 System.out.println("p2==p3 : " + (p2==p3));
		 System.out.println("p2==p4 : " + (p2==p4));
		 
		 //equals�޼ҵ� ��(��� ��), equality
		 //	-> ��ü�� ��(����)�� ���� ���� ������ �� �˻�
		 System.out.println("p2.equals(p3) : " + p2.equals(p3));
		 System.out.println("p2.equals(p4) : " + p2.equals(p4));
		 
		 
		 System.out.println("\n---hashCode()-----");
		 
		 System.out.println("p2 : " + p2.hashCode());
		 System.out.println("p2 : " + p3.hashCode());
		 System.out.println("p2 : " + p4.hashCode());
		 
		 System.out.println("------");
		 
		 String s1 = new String("Apple");
		 String s2 = new String("Apple");
		 String s3 = new String("Banana");
		 String s4 = s1;//���� ����
		 
		 System.out.println("s1 : "+s1.hashCode());
		 System.out.println("s2 : "+s2.hashCode());
		 System.out.println("s3 : "+s3.hashCode());
		 System.out.println("s4 : "+s4.hashCode());
		 
		 System.out.println("\n---clone()-----");
		 
		 Point p_ori = new Point(33,44);
		 Point p_clone1 = p_ori; //���� ����
		 Point p_clone2 = new Point( p_ori.x, p_ori.y); //���� ����
		 
		 //--------------------------------------------
		 
		 //clone()�� �̿��� ���� ����
		 Point p_clone3 = null;
		 try {
			p_clone3 = (Point) p_ori.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println(p_clone3);
		 
		 //---------------------------------------------
		 
		 System.out.println("\n--�迭 clone()---");
		 int[] arr = {1,2,3,4,5};
		 int[] other = arr.clone();
		 arr[1] = 888;
		 
		 System.out.println("arr : " + Arrays.toString(arr));
			System.out.println("other : " + Arrays.toString(other));
		 
	}
}
