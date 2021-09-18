package fingergame;
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
	public int finger(){
		return 1;//出拳的结果值
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
