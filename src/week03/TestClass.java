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
class Goods{
	//1-��ͬ������
	private String code;//����
	private String name;//����
	private double price;//�۸�
	//2-����---����=����
	//չʾ��Ʒ��Ϣ
	//�������� ��������������{����}
	//��������--����ִ����֮�󷵻ص���������(retrun���ص�����)
	//returen
	//�����Ĳ��������������ǲ���ȷ��������
	//�����վ� ��ѧ��(����=xf){�ɷ�xf}
	//��Ȫˮ ���ȣ�10��{��ˮ����ˮ����}
	void show(){
		System.out.println("����\t\t����\t\t�۸�");
		System.out.println(code+"\t\t"+name+"\t\t"+price);
		//return;//�������ݿ���ʡ��
	}
	
}
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods product1=new Goods();//�ഴ������
		//ʹ�ö��󣬸����Ը�ֵ
//		product1.code="1001";
//		product1.name="���";
//		product1.price=-2.5;//���Կ���ֱ�Ӹ�ֵ��
		product1.show();

	}

}
