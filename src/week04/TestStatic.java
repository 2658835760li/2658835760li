package week04;

import java.util.Scanner;

class  Student{
	String name;
	String no;
	int javaScore;//�ɼ�
	static String teacher;//�ڿν�ʦ
	//static�����
	static{
		//
		teacher="Wang";
	}
	
	//���췽��
	public Student(String no,String name,  int javaScore, String teacher) {
		 
		this.name = name;
		this.no = no;
		this.javaScore = javaScore;
		this.teacher = teacher;
	}
	static void fun( ){
		System.out.println(teacher);
		//System.out.println(name);//��̬���������ܷ�����ľ�̬��Ա
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
		Student.fun();//static����������new���������÷���������������
		//�����࣬��̬����
		
		Math.abs(1);
		
		Student s1=new Student("101", "tom", 76, "Wang");
		Student s2=new Student("102", "jerry", 65, "Li");
		new Student("111", "abc", 51, "zhang").show();;
		
		
		
		s1.show();//������.����
		s2.show();
		s1=s2;
		s1.show();
		s2.show();
		
		
		
		

	}

}
