package week06;
//����һ���ӿ�
//�ӿ��й涨һ��USB�ӿڵĲ����淶��
//����USB�ӿڣ�4�����ţ�1��vcc��1��gnd��1�����ߣ�1У����
//���弴��

interface USB{
	//����--��̬����
	public static final int line=4;//4������
	double weidth=8.2;//���,ʡ��public static final
	double height=5.1;//�߶�,ʡ��public static final
	 //����--����ʡ��abstract
	//1-���󷽷� 
	void inUse();//���弴��
	 //2-Ĭ�Ϸ���
	default void fun1(){
		//������
	}
	//3-��̬����
	static void fun2(){
		//������
	}
	
}

interface Disk{
	
}
//�ͼ̳�����
//�ӿ�ʵ��
class USBLight implements USB{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("usb����");
	}
	
}

class USBFun implements USB{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("usb����ת��");
	}
	
}
//�ӿڿ��Զ�ʵ�֣��ж���ӿ������࣬ͬʱ�����Լ̳�
class IO{}

class USBDisk extends IO implements USB,Disk{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("u�̴�������");
	}
	
}

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		USB usbDevice=new USBLight();
		usbDevice.inUse();
		USB usbDevice2=new USBFun();
		usbDevice2.inUse();

	}

}
