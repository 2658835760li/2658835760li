package fingergame;
/*
 * ����
���ԣ���ɫ����
             ��Ϸ����
��������ȭ

 */
public class Computer {
	private String  name;//����
	private int score;//����
	//���췽��
	public Computer(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	//��ȭ��1-������2-ʯͷ��3-��
	//���1-3
	public int finger(){
		int f=(int)(Math.random()*10)%3+1;
		System.out.println(name+"��ȭ:"+f);
		return f;//��ȭ�Ľ��ֵ
	}
	//ʤ���ӷ�
	public void win(){
		score++;
	}
	
	//set��get
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
