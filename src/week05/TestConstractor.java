package week05;
class GrandFather{
	public GrandFather() {
		// TODO Auto-generated constructor stub
		System.out.println("����GrandFather");
	}
}

class Father extends GrandFather{
	public Father() {
		// TODO Auto-generated constructor stub
		System.out.println("����Father");
	}
}
class Son extends Father{
	public Son() {
		// TODO Auto-generated constructor stub
		System.out.println("����Son");
	}
}
public class TestConstractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
	}

}
