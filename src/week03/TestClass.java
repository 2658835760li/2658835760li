package week03;

/*
 * ��Ʒ��
 * 
 * ��Ʒ����Ĺ�ͬ����
 * ����
 * �۸�
 * ����
 */
//������Сд��ĸ��ͷ
//��������ĸ��д
class Goods {
	// 1-��ͬ������
	private String code;// ����
	private String name;// ����
	private double price;// �۸�
	//���췽��,�޲���
	public Goods() {
		// TODO Auto-generated constructor stub
		code="10";
		name="noname";
		price=2.0;
	}
	//�������Ĺ��췽��
	public Goods(String code){
		this.code=code;
		name="noname";
		price=2.0;
	}

	// ����ֵ����---�����ķ���
	// ��������������ֵ
	// ����
	public void setCode(String code) {
		// ʹ�ò���code������code���и�ֵ
		this.code =code;
	}
	public String getCode(){
		return code;
	}
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// ���ü۸�
	// �������� ��������������{���ܴ���}
	// ����---��ȷ�������ݣ����ݵ�ֵ���ǹ̶��ģ�

	public void setPrice(double p) {
		// ������ֵ��������
		if (p > 0) {
			price = p;//
		} else {
			System.out.println("�۸�������0");
		}

	}

	
	// ��������ȡ����ֵ
	// get����
	// �������� ��������������{���ܴ���}
	public double getPrice() {
		return price;
	}

	// 2-����---����=����
	// չʾ��Ʒ��Ϣ
	// �������� ��������������{����}
	// ��������--����ִ����֮�󷵻ص���������(retrun���ص�����)
	// returen
	// �����Ĳ��������������ǲ���ȷ��������
	// �����վ� ��ѧ��(����=xf){�ɷ�xf}
	// ��Ȫˮ ���ȣ�10��{��ˮ����ˮ����}
	void show() {
		System.out.println("����\t\t����\t\t�۸�");
		System.out.println(code + "\t\t" + name + "\t\t" + price);
		// return;//�������ݿ���ʡ��
	}

}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
		Goods product1 = new Goods();// �ഴ������
		// ʹ�ö��󣬸����Ը�ֵ
		// product1.code="1001";
		// product1.name="���";
		// product1.price=-2.5;//���Կ���ֱ�Ӹ�ֵ��
		product1.setPrice(-2.5);
		product1.setCode("1001");
		product1.show();
		System.out.println("�۸�=" + product1.getPrice());
		Goods product2=new Goods();//new�Զ����ù��췽�����޲���
		Goods product3=new Goods("1002");//���ô������Ĺ��췽��
		product3.show();

	}

}
