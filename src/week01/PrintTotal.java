package week01;

import java.util.Scanner;

/*
 * ��ӡ����СƱ
 */

public class PrintTotal {
	public static void main(String[] args) {
		// ���������ݿ����ñ仯
		// 1-������������
		String productName1;// �ŵ�һ����Ʒ��
		String productName2;// �ŵ�2����Ʒ��
		// 2-��������ֵ
		productName1 = "���";
		productName2 = "��";
		// ����������ͬʱ��ֵ
		float productPrice1 = 7.5f;// Java��С��Ĭ��Ϊdouble���ͣ�
		// �����Ҫʹ��float���͵�С��,+f
		float productPrice2 = (float) 2.5;// ǿ��ת����float

		int number1 = 2;// ��Ʒ����
		int number2 = 3;
		double total1;
		double total2;
		// �����Ʒ����
		System.out.println("-----����СƱ----");
		System.out.println("��Ʒ��   ����      ����       �ܼ�");
		// System.out.println("���      7.5   2    15");
		System.out.println(productName1 + "    " + productPrice1 + "    "
				+ number1 + "    " + productPrice1 * number1);
		System.out.println("��          2.5   3    7.5");
		System.out.println("�ܼ۸� 22.5");
		// �˿͸������
		// ����˿͵ĸ�����
		// �ø�����-��Ʒ���ܽ��=���㣬�����Ϣ
		// ������ʹ�õ����ݡ��������Ʒ�ܽ�����
		float pay;// �û�������
		float sum;// ��Ʒ���
		float repay;// ����
		// sum=�ۼӣ���Ʒ�ļ۸�*������
		sum = 22.5f;
		// 1-�����û��ĸ�����
		// ��������һ��Scaner������������in
		Scanner in = new Scanner(System.in);// Ĭ�ϼ�������
		System.out.println("�����븶���");
//		�жϽ�����Ҫ��������ݵ�����
		if (!in.hasNextFloat()) {
			//����ʵ�����������ʾ
			System.out.println("�������������");			
			
		}else {
			//ʵ��������������
			pay = in.nextFloat();
			// 2-��������
			// �ж�����Ĵ�С
			if (pay >= sum) {
				// ������ڵ���0�������������
				repay = pay - sum;
				System.out.println("���㣺" + repay);
			} else {
				// ���С��0����ʾ��������㡱
				System.out.println("�������");
			}
		}
		
		
		// ����������ctrl+shift+f
		/*
		 * ���⣺ 
		 * ����1����������������֡� �ж���������ݣ�����������֣��������㣻�������֣���ʾ��Ϣ��������������֡�
		 * ����2�����㣬������Ҫ��С���ܽ����������㡣 �ж�����Ĵ�С�����������ڵ���0������������������С��0����ʾ��������㡱
		 * ����3��ÿһ����Ʒ������3����������Ʒ�������ۣ�����������̫��û�취����----���� 
		 * ����4��ʵ���������Ʒ���루�����룩----
		 */

	}

}
