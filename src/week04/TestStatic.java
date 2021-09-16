package week04;

import java.util.Scanner;

class  Student{
	String name;
	String no;
	int javaScore;//成绩
	static String teacher;//授课教师
	//static代码块
	static{
		//
		teacher="Wang";
	}
	
	//构造方法
	public Student(String no,String name,  int javaScore, String teacher) {
		 
		this.name = name;
		this.no = no;
		this.javaScore = javaScore;
		this.teacher = teacher;
	}
	static void fun( ){
		System.out.println(teacher);
		//System.out.println(name);//静态方法中能能访问类的静态成员
	}
	void show(){
		System.out.println(no);
		System.out.println(name);
		System.out.println(javaScore);
		System.out.println(teacher);
	}

}
public class TestStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.fun();//static方法，不用new对象来调用方法，用类名调用
		//工具类，静态方法
		
		Math.abs(1);
		
		Student s1=new Student("101", "tom", 76, "Wang");
		Student s2=new Student("102", "jerry", 65, "Li");
		new Student("111", "abc", 51, "zhang").show();;
		
		
		
		s1.show();//对象名.方法
		s2.show();
		s1=s2;
		s1.show();
		s2.show();
		
		
		
		

	}

}
