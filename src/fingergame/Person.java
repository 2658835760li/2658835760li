package fingergame;
/*
 * ��
���ԣ�����
             ��Ϸ����
��������ȭ

 */
public class Person {
	private String  name;//����
	private int score;//����
	//���췽��
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	//��ȭ��1-������2-ʯͷ��3-��
	public int finger(){
		return 1;//��ȭ�Ľ��ֵ
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
