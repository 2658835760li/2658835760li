package fingergame;

import java.util.Scanner;

/*
 * ��
���ԣ�����
             ��Ϸ����
��������ȭ

 */
public class Person {
	private String  name;//����
	private int score;//����
	//���췽��
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	//��ȭ��1-������2-ʯͷ��3-��
	//�������ִ����ȭ����
	public int finger(){
		Scanner in=new Scanner(System.in);
		int f;//����ĳ�ȭֵ
		do{
			System.out.println("���ȭ��1-������2-ʯͷ��3-�����������ֳ�ȭ��");
			f=in.nextInt();
		}while(f>3|f<1);
		System.out.println(name+"��ȭ:"+f);
		return f;//��ȭ�Ľ��ֵ
	}
	//ʤ���ӷ�
	public void win(){
		score++;
	}
	
	//set��get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	

}
