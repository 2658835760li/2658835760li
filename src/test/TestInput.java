package test;

import java.util.Scanner;//����



public class TestInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������
		int number;//����һ������
		//number=��������
		//��������һ��Scaner������������in
		Scanner in=new Scanner(System.in);//Ĭ�ϼ�������
		//�����û�������Ҫ����ʲô����
		System.out.println("������������");
		//ʹ��in������next***������������
		number=in.nextInt();
		//���number��ֵ
		System.out.println("number="+number);
		System.out.println("�����븶���");
		//����ʵ������
		float pay=in.nextFloat();
		System.out.println("pay="+pay);

	}

}
