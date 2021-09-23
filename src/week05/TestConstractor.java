package week05;
class GrandFather{
	public GrandFather() {
		// TODO Auto-generated constructor stub
		System.out.println("调用GrandFather");
	}
}

class Father extends GrandFather{
	public Father() {
		// TODO Auto-generated constructor stub
		System.out.println("调用Father");
	}
}
class Son extends Father{
	public Son() {
		// TODO Auto-generated constructor stub
		System.out.println("调用Son");
	}
}
public class TestConstractor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son();
	}

}
