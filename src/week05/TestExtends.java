package week05;

import java.util.Scanner;






 /*
 * ��������----����/����
 * �������̳������
 */

abstract class Student{
	void show(){
		//������
	}
}

class ManStudent extends Student{
	
}



abstract class Player{
	public Player() {
		// TODO Auto-generated constructor stub
		System.out.println("����player�Ĺ��췽��");
	}
	String name;
	int score;
	//����ʵ�֣�ȱ����Ϣ�������в�����Ϣ��������ʵ�ַ�������ʱ�޷�ʵ��
	//���󷽷�---�޷�����
	abstract int finger();
	//final���������ܱ�������д���޸ģ�
	final void win(){
		score++;
	}
}
//�������������
//����̳и���ķ���������
//Person�̳и���Player���̳и����еĳ��󷽷��������Person��ʵ�ָ���ĳ��󷽷���Person���ǳ����ࣻ����Person���ǳ�����
class Person extends Player{
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("����person�Ĺ��췽��");
	}
	//��������Լ������Ժͷ���
	void show(){
		
		this.finger();//ʡ�Զ������������finger����
//		super.finger();//superָ��������󣬸����finger����
		System.out.println(name+"----"+score);
	}
	//��������123�����г�ȭ,���س�ȭ��ֵ
	//������д����ķ���---���෽��������������
	public int finger(){
		
		//���ø���ķ���
		
//		super.finger();
		Scanner in=new Scanner(System.in);
		int f;//����ĳ�ȭֵ
		do{
			System.out.println("���ȭ��1-������2-ʯͷ��3-�����������ֳ�ȭ��");
			f=in.nextInt();
		}while(f>3|f<1);
		System.out.println(name+"��ȭ:"+f);
		return f;//��ȭ�Ľ��ֵ
	}
	
	
	
}
 //�������������
//Computerû��ʵ�ָ���ĳ��󷽷�������Computer���ǳ�����
abstract class Computer extends Player{
	
}



public class TestExtends {

	public static void main(String[] args) {
//		new Student() ;
		// TODO Auto-generated method stub
		Person p1=new Person();//���췽��
//		p1.show();
		System.out.println("��ȭ"+p1.finger());//��������������ķ���
//		Player p=new Player();//�������
//		System.out.println("��ȭ"+p.finger());//���������ø���ķ���
	}

}
