package test;
/*
 * ��ӡ����СƱ
 */

public class PrintTotal {
	public static void main(String[] args) {
		//���������ݿ����ñ仯
		//1-������������
		String productName1;//�ŵ�һ����Ʒ��
		String productName2;//�ŵ�2����Ʒ��
		//2-��������ֵ
		productName1="���";
		productName2="��";
		//����������ͬʱ��ֵ
		float productPrice1=7.5f;//Java��С��Ĭ��Ϊdouble���ͣ�
		//�����Ҫʹ��float���͵�С��,+f
		float productPrice2=(float) 2.5;//ǿ��ת����float		
		int number1=2;//��Ʒ����
		int number2=3;
		double total1;
		double total2;
		//�����Ʒ����
		System.out.println("-----����СƱ----");
		System.out.println("��Ʒ��   ����      ����       �ܼ�");
		//System.out.println("���      7.5   2    15");
		System.out.println(productName1+"    "+productPrice1+
				"    "+number1+"    "+productPrice1*number1);
		System.out.println("��          2.5   3    7.5");
		total1=productPrice1*number1;
		total2=productPrice2*number2;
		double sum=total1+total2;
		System.out.println("�ܼ۸� "+sum);
		//����ʵ�����������
	}

}
