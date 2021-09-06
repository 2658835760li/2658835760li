package week01;

import java.util.Scanner;

/*
 * 打印购物小票
 */

public class PrintTotal {
	public static void main(String[] args) {
		// 变量，内容可以用变化
		// 1-声明变量类型
		String productName1;// 放第一个商品名
		String productName2;// 放第2个商品名
		// 2-给变量赋值
		productName1 = "面包";
		productName2 = "本";
		// 声明变量的同时赋值
		float productPrice1 = 7.5f;// Java中小数默认为double类型，
		// 如果需要使用float类型的小数,+f
		float productPrice2 = (float) 2.5;// 强制转换成float

		int number1 = 2;// 商品数量
		int number2 = 3;
		double total1;
		double total2;
		// 输出商品内容
		System.out.println("-----购物小票----");
		System.out.println("商品名   单价      数量       总价");
		// System.out.println("面包      7.5   2    15");
		System.out.println(productName1 + "    " + productPrice1 + "    "
				+ number1 + "    " + productPrice1 * number1);
		System.out.println("本          2.5   3    7.5");
		System.out.println("总价格： 22.5");
		// 顾客付款，找零
		// 输入顾客的付款金额
		// 用付款金额-商品的总金额=找零，输出信息
		// 分析：使用的数据。付款金额，商品总金额，找零
		float pay;// 用户付款金额
		float sum;// 商品金额
		float repay;// 找零
		// sum=累加（商品的价格*数量）
		sum = 22.5f;
		// 1-输入用户的付款金额
		// 首先声明一个Scaner变量，变量名in
		Scanner in = new Scanner(System.in);// 默认键盘输入
		System.out.println("请输入付款金额：");
//		判断接下来要输入的数据的类型
		if (!in.hasNextFloat()) {
			//不是实型数，输出提示
			System.out.println("输入必须是数字");			
			
		}else {
			//实型数，继续结算
			pay = in.nextFloat();
			// 2-计算找零
			// 判断找零的大小
			if (pay >= sum) {
				// 找零大于等于0，正常付款操作
				repay = pay - sum;
				System.out.println("找零：" + repay);
			} else {
				// 如果小于0，提示“付款金额不足”
				System.out.println("付款金额不足");
			}
		}
		
		
		// 代码缩进，ctrl+shift+f
		/*
		 * 问题： 
		 * 问题1：输入金额必须是数字。 判断输入的数据，如果输入数字，继续结算；不是数字，提示信息“输入必须是数字”
		 * 问题2：找零，付款金额要不小于总金额，负数的找零。 判断找零的大小，如果找零大于等于0，正常付款操作；如果小于0，提示“付款金额不足”
		 * 问题3：每一个商品，定义3个变量，商品名，单价，数量。变量太多没办法管理。----数组 
		 * 问题4：实际情况，商品编码（条形码）----
		 */

	}

}
