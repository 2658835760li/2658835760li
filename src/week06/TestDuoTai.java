package week06;
/*
 * ��̬
 * 
 * ������
 * 
 */
//����
abstract class Pet {
	String name;//�ǳ�
	int age;//����
	int health;//����
	int love;//���ܶ�
	//
	void eat(){
		System.out.println("����Զ���");
	}
	abstract void play();//���󷽷�
}
class Cat extends Pet{
	@Override
	void eat() {
		// TODO Auto-generated method stub
		super.eat();//���෽��eat
		System.out.println("è����");
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
		System.out.println("���Թ�ͷ");
	}
	void work(){
		System.out.println("����ѩ��");
	}
	@Override
	void play() {
		// TODO Auto-generated method stub
		
	}
}

public class TestDuoTai {
/*
 * 

	//û�ж�̬��������
	//����--ÿһ������ĳ��дһ����Ӧ�����ط���
	static void reasePet(Dog d){
		//ι�����
		d.eat();
	}
	static void reasePet(Cat d){
		//ι�����
		d.eat();
	}
 */
	//��̬�Ľ������
	static void reasePet(Pet c){
		//ι�����
		c.eat();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p1��2�����ͣ�
		//���棺�������� Pet����  ------���������Ǹ�������
		//���棺ʵ������new Dog------ʵ�ʴ�����������
		 
		Pet p1=new Dog();
		Pet p2=new Cat();
		//1-��̬��p1����ִ�е�ʱ�������Ϊʵ������new������
		p1.eat();//eat����������д�˸����eat�����ݶ��������ȷ�������Ǹ�eat����
		p2.eat();
		//2-�������p1��̬���󣬱༭�����������ͣ�Pet��û�����work����
		//p1.work();//ʵ��new��Dog��������work����
		//3-p1����Ϊ�������ͣ���Ҫʹ��ʵ�ʵ�p1���������ͣ�ʹ�������������еķ���
		
		//ǿ������ת��������--���ࣩ
		"".equals("");
		if (p1 instanceof Dog) {
			//���p1��Dog���͵Ķ���ʵ������ǿ��ת��
			((Dog)p1).work();
		}
		//�������͵�ǿ��ת��
		
		
		System.out.println("------------");
		Cat c=new Cat();
		reasePet(c);
		Dog d=new Dog();
		reasePet(d);
		//�����ڲ���
		//��������--new Cat����
		reasePet(new Cat());
		//�����ڲ���
		reasePet(new Pet(){

			@Override
			void play() {
				// TODO Auto-generated method stub
				
			}
			
		});
		//��Ƹ--��������Ա---Person
		//ʵ����Ƹ����Student

	}


}
