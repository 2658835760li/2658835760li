package week04;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestChongZai {
	//�ӷ���int+int,�����ʾ���
	public static void add(int a,int b){
		System.out.println("�������ӷ�");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	//double+double
	
	public static void add(double a,double b){
		System.out.println("ʵ�����ӷ�");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	//int +int+int
	public static void add(int a,int b,int c){
		System.out.println("3�����ӷ�");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,5, 6);
	}

}
