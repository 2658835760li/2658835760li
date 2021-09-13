package week04;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class TestChongZai {
	//加法，int+int,结果显示输出
	public static void add(int a,int b){
		System.out.println("整型数加法");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	//double+double
	
	public static void add(double a,double b){
		System.out.println("实型数加法");
		System.out.println(a+"+"+b+"="+(a+b));
	}
	//int +int+int
	public static void add(int a,int b,int c){
		System.out.println("3个数加法");
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(2,5, 6);
	}

}
