package week03;

import java.util.Scanner;

import javax.naming.directory.SearchControls;

import utils.GoodsInfoUtils;

public class TestArray {
	// 创建商品信息数组，3个，商品编号数组，商品名称数组，商品价格数组
	// 商品编号数组
	public static String[] goodsCode = new String[6];// 声明一个数组，名字goodsCode，类型String数组
	// 创建数组，确定数组的大小（数组中能存放的数据的个数）---方式1
	// 声明数组，创建数组，同时，给数组元素赋初值-----方式2
	public static String[] goodsName = new String[] { "面包", "笔记本", "钢笔", "纸杯",
			"书包", "面巾纸" };
	// 方式2-创建价格数组,继续简化
	public static double[] goodsPrice = { 7.5, 2.5, 21, 5.3, 61.2, 9 };
	//查找位置的方法
	//根据输入的商品的编码，到编码数组中找到这个商品的位置，返回位置；如果没有这个商品返回-1
	public static int searchByCode(String code){
		int index=-1;
		// 商品在数组中的位置
		// 找到编码，位置的范围0-5（数组的长度-1）
		// 没有找到-1
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
		// 使用，数组名[下标值],0开始
		goodsCode[0] = "1001";
		goodsCode[1] = "1002";
		goodsCode[2] = "1003";
		goodsCode[3] = "1004";
		goodsCode[4] = "1005";
		goodsCode[5] = "1006";
		// 商品购物车，输入商品编号，找到价格，累加
		// 输入编号
		double sum = 0;// 总价格
		Scanner in = new Scanner(System.in);
		int[] shoppingList=new int[100];
		int count=0;//商品数量
		while (true) {
			//1-输入商品编码
			System.out.println("请输入商品的编码：");
			String code = in.next();
			//2-判断，如果输入000，结束，跳出循环，否则，继续结算
			if (code.equals("000")) {
				break;//跳出循环
			}
			// 3-找到输入编码的位置（下标值）
			int index=searchByCode(code);
			//4-根据找到的位置，如果是-1，没有这个商品；否则，从价格数组的而对应位置找到价格，累加
			if (index == -1) {
				System.out.println("没有这个商品");
			} else {
				System.out.println("找到，位置=" + index);
				//将位置添加到购物清单，购物的商品数+1
				shoppingList[count++]=index;
				// 根据位置index到价格数组的对应位置，找到价格，累加
				sum = sum + goodsPrice[index];
			}
		}
		//5-打印小票，名字，价格
		//有几个商品，循环几次
		System.out.println("-------购物小票------- ");
		System.out.println("商品编号\t商品名\t单价	");
		for (int i = 0; i < count; i++) {
			System.out.println(goodsCode[i]+"\t"+goodsName[i]+"\t"+goodsPrice[i]);
		}
		System.out.println("--------------------");
		System.out.println("应付款：" + sum);
	}
}
