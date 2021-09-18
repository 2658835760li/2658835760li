package fingergame;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person p=new Person("tom");
//		System.out.println(p.getName()+p.getScore());
//		Computer computer=new Computer("jerry");
//		System.out.println(computer.getName()+computer.getScore());
//		
//		System.out.println(p.finger());
//		System.out.println(computer.getName()+computer.finger());
		Game game=new Game();
		game.start();
		System.out.println(game.player1.getName());
		System.out.println(game.player2.getName());
		

	}

}
