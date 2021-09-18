package fingergame;
/*
 * 电脑
属性：角色名称
             游戏积分
动作：出拳

 */
public class Computer {
	private String  name;//名称
	private int score;//积分
	//构造方法
	public Computer(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	//出拳。1-剪刀，2-石头，3-布
	//随机1-3
	public int finger(){
		int f=(int)(Math.random()*10)%3+1;
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
