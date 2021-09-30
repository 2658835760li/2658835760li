package week06;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 除法操作
 * 
 * 被除数/除数=商...余数
 * 
 * 输入int
 * 
 * 解决方案1--if
 * // if (in.hasNextInt()) {
 //
 // }
 * 
 //		if (number2==0) {
 //			System.out.println("除数不能为0");
 //		}else {
 //			System.out.println(number1+"/"+number2+"="+number1/number2);
 //		}
 */

class MyException extends Exception{
	public MyException(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}
}
public class TestException {
	//抛出异常
	public static void divid()throws ArithmeticException,InputMismatchException,Exception {
		Scanner in = new Scanner(System.in);

		System.out.println("请输入被除数：");

		int number1 = in.nextInt();
		System.out.println("请输入除数：");
		int number2 = in.nextInt();
		System.out.println(number1 + "/" + number2 + "=" + number1 / number2);// 可能会有异常
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
		
		Scanner in = new Scanner(System.in);
		try {
			System.out.println("请输入被除数：");

			int number1 = in.nextInt();
			System.out.println("请输入除数：");
			int number2 = in.nextInt();
			System.out.println(number1 + "/" + number2 + "=" + number1
					/ number2);// 可能会有异常
		} catch (ArithmeticException e) {
			// 异常处理
			System.out.println("除数不能为0");
		} catch (InputMismatchException e1) {
			// TODO: handle exception
			// 异常处理
			System.out.println("输入整形数据");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("运算出错");
		}
 */
		try {
			divid();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//除法
		System.out.println("程序执行其他操作");
		System.out.println("程序结束");

	}

}
