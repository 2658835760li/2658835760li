package week03;

import java.util.Scanner;

import javax.naming.directory.SearchControls;

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
	//����λ�õķ���
	//�����������Ʒ�ı��룬�������������ҵ������Ʒ��λ�ã�����λ�ã����û�������Ʒ����-1
	public static int searchByCode(String code){
		int index=-1;
		// ��Ʒ�������е�λ��
		// �ҵ����룬λ�õķ�Χ0-5������ĳ���-1��
		// û���ҵ�-1
		for (int i = 0; i < goodsCode.length; i++) {
			if (goodsCode[i].equals(code)) {
				index = i;
				break;
			}
		}
		return index;
	}
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
			//1-������Ʒ����
			System.out.println("��������Ʒ�ı��룺");
			String code = in.next();
			//2-�жϣ��������000������������ѭ�������򣬼�������
			if (code.equals("000")) {
				break;//����ѭ��
			}
			// 3-�ҵ���������λ�ã��±�ֵ��
			int index=searchByCode(code);
			//4-�����ҵ���λ�ã������-1��û�������Ʒ�����򣬴Ӽ۸�����Ķ���Ӧλ���ҵ��۸��ۼ�
			if (index == -1) {
				System.out.println("û�������Ʒ");
			} else {
				System.out.println("�ҵ���λ��=" + index);
				//��λ����ӵ������嵥���������Ʒ��+1
				shoppingList[count++]=index;
				// ����λ��index���۸�����Ķ�Ӧλ�ã��ҵ��۸��ۼ�
				sum = sum + goodsPrice[index];
			}
		}
		//5-��ӡСƱ�����֣��۸�
		//�м�����Ʒ��ѭ������
		System.out.println("-------����СƱ------- ");
		System.out.println("��Ʒ���\t��Ʒ��\t����	");
		for (int i = 0; i < count; i++) {
			System.out.println(goodsCode[i]+"\t"+goodsName[i]+"\t"+goodsPrice[i]);
		}
		System.out.println("--------------------");
		System.out.println("Ӧ���" + sum);
	}
}
