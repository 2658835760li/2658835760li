package week03;

import java.util.Scanner;

import utils.GoodsInfoUtils;

public class TestArray {
	// ������Ʒ��Ϣ���飬3������Ʒ������飬��Ʒ�������飬��Ʒ�۸�����

	// ��Ʒ�������
	public static String[] goodsCode = new String[6];// ����һ�����飬����goodsCode������String����
	// �������飬ȷ������Ĵ�С���������ܴ�ŵ����ݵĸ�����---��ʽ1
	// �������飬�������飬ͬʱ��������Ԫ�ظ���ֵ-----��ʽ2
	public static String[] goodsName = new String[] { "���", "�ʼǱ�", "�ֱ�", "ֽ��",
			"���", "���ֽ" };
	// ��ʽ2-�����۸�����,������
	public static double[] goodsPrice = { 7.5, 2.5, 21, 5.3, 61.2, 9 };

	//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodsInfoUtils.showAll();
		// ʹ�ã�������[�±�ֵ],0��ʼ
		goodsCode[0] = "1001";
		goodsCode[1] = "1002";
		goodsCode[2] = "1003";
		goodsCode[3] = "1004";
		goodsCode[4] = "1005";
		goodsCode[5] = "1006";
		// ��Ʒ���ﳵ��������Ʒ��ţ��ҵ��۸��ۼ�
		// ������
		double sum = 0;// �ܼ۸�
		Scanner in = new Scanner(System.in);
		int[] shoppingList=new int[100];
		int count=0;//��Ʒ����
		while (true) {

			System.out.println("��������Ʒ�ı��룺");

			String code = in.next();
			if (code.equals("000")) {
				break;//����ѭ��
			}

			// �ҵ��������������������±�ֵ
			int index = -1;// ��Ʒ�������е�λ��
			// �ҵ����룬λ�õķ�Χ0-5������ĳ���-1��
			// û���ҵ�-1
			for (int i = 0; i < goodsCode.length; i++) {
				if (goodsCode[i].equals(code)) {
					index = i;
					break;
				}
			}

			if (index == -1) {
				System.out.println("û�������Ʒ");
			} else {
				System.out.println("�ҵ���λ��=" + index);
				// ����λ��index���۸�����Ķ�Ӧλ�ã��ҵ��۸��ۼ�
				shoppingList[count++]=index;

				sum = sum + goodsPrice[index];
			}
		}
		//��ӡСƱ�����֣��۸�
		for (int i = 0; i < count; i++) {
			System.out.println(goodsName[i]+"\t"+goodsPrice[i]);
		}

		System.out.println("sum=" + sum);

	}
}
