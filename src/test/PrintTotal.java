package test;
/*
 * 打印购物小票
 */

public class PrintTotal {
	public static void main(String[] args) {
		//变量，内容可以用变化
		//1-声明变量类型
		String productName1;//放第一个商品名
		String productName2;//放第2个商品名
		//2-给变量赋值
		productName1="面包";
		productName2="本";
		//声明变量的同时赋值
		float productPrice1=7.5f;//Java中小数默认为double类型，
		//如果需要使用float类型的小数,+f
		float productPrice2=(float) 2.5;//强制转换成float		
		int number1=2;//商品数量
		int number2=3;
		double total1;
		double total2;
		//输出商品内容
		System.out.println("-----购物小票----");
		System.out.println("商品名   单价      数量       总价");
		//System.out.println("面包      7.5   2    15");
		System.out.println(productName1+"    "+productPrice1+
				"    "+number1+"    "+productPrice1*number1);
		System.out.println("本          2.5   3    7.5");
		total1=productPrice1*number1;
		total2=productPrice2*number2;
		double sum=total1+total2;
		System.out.println("总价格： "+sum);
		//输入实付金额，输出找零
	}

}
