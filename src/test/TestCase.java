package test;

import java.util.Scanner;

public class TestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用来实现菜单
		/*
		 * -----欢迎使用----------
		 * 1.进入系统
		 * 2.退出
		 * ---------------------
		 * 输入数字1-2选择功能：
		 */
		/*
		 * 
		 */
		Scanner in =new Scanner(System.in);
		//显示菜单
		//回车符和换行符
		//windows,
		System.out.println("-----欢迎使用----------\r\n"+
		  "1.进入系统\r\n"+
		  "2.退出\r\n"+
		  "---------------------\r\n"+
		  "输入数字1-2选择功能：");
		//输入数字，
		int no=in.nextInt();
		/*
		 * 
		 
		//执行相应的功能
		if (no==1) {
			System.out.println("执行进入系统的操作");
			
		}else if(no==2){
			System.out.println("执行退出操作");
		}else {
			System.out.println("输入错误");
		}
		*/
		switch (no) {
		case 1:
			System.out.println("执行进入系统的操作");
			//输入密码，如果密码正确，显示菜单
			break;
		case 2:
			System.out.println("执行退出操作");
			break;
		default:
			System.out.println("输入错误");
			break;
		}

	}

}
