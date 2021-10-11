package week08;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
class Student extends Object{}
public class TestSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		// 不同的操作系统换行符不同，  window--\r\n,linux--\n
		//获取到操作系统的换行符System.getProperty("line.separator")
		
		System.out.println("这是一行语句"+System.getProperty("line.separator")+"这是下一行");
		long time=System.currentTimeMillis();
		System.out.println(time);
		Date date=new Date(time);
		System.out.println(date);
		//输出对象，输出什么内容,调用对象方法toString方法
		int a=19;
		//类型转换
		String no="123";
		int number=Integer.parseInt(no);
		
		System.out.println(new Student());
		new Object().toString();
		Math.random();//0--1
		Random random=new Random(System.currentTimeMillis());//构造方法
		random.nextInt(10);
		

	}

}
