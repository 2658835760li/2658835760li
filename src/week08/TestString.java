package week08;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//初始化
		String name="tom";
		String name2=new String("jerry");
		//空字符串,存在一个字符串，不包含字符的字符串
		String name3=null;
		String name4="";//空字符串
		//判断空字符串
		if (name4.equals("")) {
			System.out.println("是空字符串");
		}else {
			System.out.println("不是空字符串");
		}
		if (name4.isEmpty()) {
			System.out.println("是空字符串");
		}else {
			System.out.println("不是空字符串");
		}
		//判断文件是不是txt文件
		String fileName="d:\\doc\\abc.txt";//字符串中\，转义字符，\t,\r\n,想要使用\符号，用\\表示\
		if (fileName.endsWith(".txt")) {
			System.out.println("是文本文件");
			//拆分字符串，文件名和路径拆开
			String []names=fileName.split("\\\\");
			for(int i=0;i<name.length();i++){
				System.out.println(names[i]);
			}
			
			
		}else {
			System.out.println("不是文本文件");
		}
		

	}

}
