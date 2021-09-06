package week02;

import java.util.Scanner;

public class Login {

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
			//输入用户名和密码，
			String password;//密码
			String username;//用户名
			System.out.println("请输入用户名：");
			username=in.next();
			System.out.println("请输入密码：");
			password=in.next();//输入字符串
			
			//如果用户名=admin密码=1234，显示菜单；不正确，显示”密码不对“
			if (username.equals("admin")&&password.equals("1234") ) {
				System.out.println("密码正确，显示功能菜单");
			}else {
				System.out.println("用户名密码不匹配");
				//重复输入一次
				System.out.println("请输入用户名：");
				username=in.next();
				System.out.println("请输入密码：");
				password=in.next();//输入字符串
				if (username.equals("admin")&&password.equals("1234") ) {
					System.out.println("密码正确，显示功能菜单");
				}else {
					System.out.println("用户名密码不匹配");
					//重复2此
					System.out.println("请输入用户名：");
					username=in.next();
					System.out.println("请输入密码：");
					password=in.next();//输入字符串
					if (username.equals("admin")&&password.equals("1234") ) {
						System.out.println("密码正确，显示功能菜单");
					}else {
						System.out.println("用户名密码不匹配");
					}
				}
			}
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
