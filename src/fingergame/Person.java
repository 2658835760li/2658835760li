package fingergame;

import java.util.Scanner;

/*
 * 人
属性：名称
             游戏积分
动作：出拳

 */
public class Person {
	private String  name;//名称
	private int score;//积分
	//构造方法
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	//出拳。1-剪刀，2-石头，3-布
	//输入数字代表出拳操作
	public int finger(){
		Scanner in=new Scanner(System.in);
		int f;//输入的出拳值
		do{
			System.out.println("请出拳，1-剪刀，2-石头，3-布，输入数字出拳：");
			f=in.nextInt();
		}while(f>3|f<1);
		System.out.println(name+"出拳:"+f);
		return f;//出拳的结果值
	}
	//胜利加分
	public void win(){
		score++;
	}
	
	//set和get
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
