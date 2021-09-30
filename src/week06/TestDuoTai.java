package week06;
/*
 * 多态
 * 
 * 宠物类
 * 
 */
//父类
abstract class Pet {
	String name;//昵称
	int age;//年龄
	int health;//健康
	int love;//亲密度
	//
	void eat(){
		System.out.println("宠物吃东西");
	}
	abstract void play();//抽象方法
}
class Cat extends Pet{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();//父类方法eat
		System.out.println("猫吃鱼");
	}

	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
}
class Dog extends Pet{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("狗吃骨头");
	}
	void work(){
		System.out.println("狗拉雪橇");
	}
	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
}

public class TestDuoTai {
/*
 * 

	//没有多态，用重载
	//重载--每一个种类的宠物，写一个对应的重载方法
	static void reasePet(Dog d){
		//喂养宠物，
		d.eat();
	}
	static void reasePet(Cat d){
		//喂养宠物，
		d.eat();
	}
 */
	//多态的解决方案
	static void reasePet(Pet c){
		//喂养宠物，
		c.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p1有2种类型，
		//左面：声明类型 Pet类型  ------声明类型是父类类型
		//右面：实际类型new Dog------实际创建子类类型
		 
		Pet p1=new Dog();
		Pet p2=new Cat();
		//1-多态的p1对象，执行的时候的类型为实际类型new的类型
		p1.eat();//eat方法子类重写了父类的eat，根据对象的类型确定调用那个eat方法
		p2.eat();
		//2-编译出错，p1多态对象，编辑按照声明类型，Pet中没有这个work方法
		//p1.work();//实际new的Dog对象中有work方法
		//3-p1声明为父类类型，想要使用实际的p1的子类类型，使用子类类型特有的方法
		
		//强制类型转换（父类--子类）
		"".equals("");
		if (p1 instanceof Dog) {
			//如果p1是Dog类型的对象（实例），强制转换
			((Dog)p1).work();
		}
		//基本类型的强制转化
		
		
		System.out.println("------------");
		Cat c=new Cat();
		reasePet(c);
		Dog d=new Dog();
		reasePet(d);
		//匿名内部类
		//匿名对象--new Cat（）
		reasePet(new Cat());
		//匿名内部类
		reasePet(new Pet(){

			@Override
			void play() {
				// TODO Auto-generated method stub
				
			}
			
		});
		//招聘--机房管理员---Person
		//实际招聘子类Student

	}


}
