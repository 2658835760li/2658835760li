package week08;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;
class Student extends Object{}
public class TestSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		// ��ͬ�Ĳ���ϵͳ���з���ͬ��  window--\r\n,linux--\n
		//��ȡ������ϵͳ�Ļ��з�System.getProperty("line.separator")
		
		System.out.println("����һ�����"+System.getProperty("line.separator")+"������һ��");
		long time=System.currentTimeMillis();
		System.out.println(time);
		Date date=new Date(time);
		System.out.println(date);
		//����������ʲô����,���ö��󷽷�toString����
		int a=19;
		//����ת��
		String no="123";
		int number=Integer.parseInt(no);
		
		System.out.println(new Student());
		new Object().toString();
		Math.random();//0--1
		Random random=new Random(System.currentTimeMillis());//���췽��
		random.nextInt(10);
		

	}

}
