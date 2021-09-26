package week05;

import java.util.Scanner;






 /*
 * 设计玩家类----父类/基类
 * 设计子类继承玩家类
 */

abstract class Student{
	void show(){
		//方法体
	}
}

class ManStudent extends Student{
	
}



abstract class Player{
	public Player() {
		// TODO Auto-generated constructor stub
		System.out.println("父类player的构造方法");
	}
	String name;
	int score;
	//不能实现，缺乏信息，子类中补充信息（子类中实现方法）暂时无法实现
	//抽象方法---无方法体
	abstract int finger();
	//final方法，不能被子类重写（修改）
	final void win(){
		score++;
	}
}
//设计玩家类的子类
//子类继承父类的方法和属性
//Person继承父类Player，继承父类中的抽象方法，如果，Person类实现父类的抽象方法，Person不是抽象类；否则，Person还是抽象类
class Person extends Player{
	public Person() {
		// TODO Auto-generated constructor stub
		System.out.println("子类person的构造方法");
	}
	//添加子类自己的属性和方法
	void show(){
		
		this.finger();//省略对象名，子类的finger方法
//		super.finger();//super指代父类对象，父类的finger方法
		System.out.println(name+"----"+score);
	}
	//输入数字123，进行出拳,返回出拳的值
	//子类重写父类的方法---父类方法不适用于子类
	public int finger(){
		
		//调用父类的方法
		
//		super.finger();
		Scanner in=new Scanner(System.in);
		int f;//输入的出拳值
		do{
			System.out.println("请出拳，1-剪刀，2-石头，3-布，输入数字出拳：");
			f=in.nextInt();
		}while(f>3|f<1);
		System.out.println(name+"出拳:"+f);
		return f;//出拳的结果值
	}
	
	
	
}
 //设计玩家类的子类
//Computer没有实现父类的抽象方法，所以Computer还是抽象类
abstract class Computer extends Player{
	
}



public class TestExtends {

	public static void main(String[] args) {
//		new Student() ;
		// TODO Auto-generated method stub
		Person p1=new Person();//构造方法
//		p1.show();
		System.out.println("出拳"+p1.finger());//子类对象调用子类的方法
//		Player p=new Player();//父类对象
//		System.out.println("出拳"+p.finger());//父类对象调用父类的方法
	}

}
