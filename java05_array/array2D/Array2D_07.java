package java05_array.array2D;

import java.util.Scanner;

import javax.swing.plaf.ScrollPaneUI;

import java04_control.loop.For_01;

public class Array2D_07 {

	public static void main(String[] args) {
		// �л� ���� ���� ���α׷�
		
		//1~3�г�
		//2���� ��
		//4���� �л�
		//3���� int�� �迭 3��¥��
		//����
		//int[][][][] score = new int[3][2][4][3]; 4���� �̻� �� ���� ������ ���ζ�
		
		//int[][][] sco1 = new int[2][4][3];
		//int[][][] sco2 = new int[2][4][3];
		//int[][][] sco3 = new int[2][4][3]; �̷������� �����ζ� ������ ��
		
		//--------------------------------------
		
		//2���� ����, ����, ���� ������ �����ϴ� �迭
		int[][] sco = new int[2][3];
		
		int[] sum = new int[2]; //�л����� ���� �迭
		double[] avg = new double[2]; //�л����� ��� �迭
		
		//----- 2�� �л����� 3���� ���� �Է¹ޱ� -----
		Scanner sc = new Scanner(System.in); //�Է� ��ü
		
		String[] subject = {"����", "����", "����" };
		for (int i = 0; i < sco.length; i++) { //i��° �л�, 0~1, x2
	
			for (int j = 0; j < sco[i].length; j++) { //j��° ���� ����, 0~2, x3
				System.out.print((i+1)+"�� �л��� "+ subject[j]+"���� ���� �Է�: ");
				sco [i][j] = sc.nextInt();
				
			} 
			System.out.println();
		} 
//		//TEST - ������ �� �ԷµǾ����� �׽�Ʈ
//		for (int i = 0; i < sco.length; i++) {
//			for (int j = 0; j < sco[i].length; j++) {
//				System.out.print(sco[i][j] +" ");
//			}
//			System.out.println();
			
//		}
		
		
		
		//--------------------------------------------
		
		//----- ���� ���ϱ� -----
		for(int i=0; i<sco.length; i++) {//i��° �л�
			for (int j = 0; j < sco[i].length; j++) {
				sum[i] += sco[i][j]; //�������
			}
		}
		//-----------------------
		
		//----- ��� ���ϱ� -----
		for (int i = 0; i < sco.length; i++) {//��° �л�
			avg[i] = sum [i] / (double)3;
//			avg[i] = sum [i] / (double)subject.length;
		}
		//-----------------------
		
//		//TEST - ����, ��� Ȯ��
//		for(int i=0; i<sco.length; i++) {
//			System.out.println("sum: "+ sum[i] + ", avg: "+ avg[i]);
//		}
		
		//----- ���� ��� -------
		//ex)	��ȣ	����	����	����	����	���
		//		1��		xxx		xxx		xxx		xxx		xxx.xx
		//		2��		xxx		xxx		xxx		xxx		xxx.xx
		
		System.out.println("��ȣ\t����\t����\t����\t����\t���");
		
		for (int i = 0; i < sco.length; i++) {//i��° �л�
			System.out.print((i+1)+"��");//��ȣ
			
			for (int j = 0; j < sco[i].length; j++) {//j��° ����
				System.out.print("\t"+sco[i][j]);
			}
			System.out.print("\t"+sum[i]); //����
			System.out.println("\t"+ Math.round(avg[i]*100)/(double)100); //���			
		}
		//-----------------------
		
		

	}

}
