package fingergame;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("tom");
		System.out.println(p.getName()+p.getScore());
		Computer computer=new Computer("jerry");
		System.out.println(computer.getName()+computer.getScore());
		
		System.out.println(p.finger());

	}

}
