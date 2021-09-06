package test;

import java.util.Scanner;//导包



public class TestInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入整形数据
		int number;//声明一个变量
		//number=键盘输入
		//首先声明一个Scaner变量，变量名in
		Scanner in=new Scanner(System.in);//默认键盘输入
		//告诉用户接下来要输入什么数据
		System.out.println("请输入数量：");
		//使用in变量的next***方法接受数据
		number=in.nextInt();
		//输出number的值
		System.out.println("number="+number);
		System.out.println("请输入付款金额：");
		//输入实型数据
		float pay=in.nextFloat();
		System.out.println("pay="+pay);

	}

}
