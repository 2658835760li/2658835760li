package week05;

import java.util.Scanner;






/*
 * ��������----����/����
 * �������̳������
 */

class Player{
	public Player() {
		// TODO Auto-generated constructor stub
		System.out.println("����player�Ĺ��췽��");
	}
	String name;
	int score;
	 int finger(){
		 System.out.println("����ĳ�ȭ�ķ���");
		return 0;
	}
	void win(){
		score++;
	}
}
//�������������
//����̳и���ķ���������
class Person extends Player{
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("����person�Ĺ��췽��");
	}
	//��������Լ������Ժͷ���
	void show(){
		System.out.println(name+"----"+score);
	}
	//��������123�����г�ȭ,���س�ȭ��ֵ
	//������д����ķ���---���෽��������������
	public int finger(){
		
		//���ø���ķ���
		
		super.finger();
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
class Computer extends Player{
	
}



public class TestExtends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();//���췽��
//		p1.show();
//		System.out.println("��ȭ"+p1.finger());
//		Player p=new Player();//�������
//		System.out.println("��ȭ"+p.finger());
	}

}
