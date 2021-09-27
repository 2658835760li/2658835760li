package week06;
//定义一个接口
//接口中规定一下USB接口的操作规范。
//假设USB接口，4个引脚：1个vcc，1个gnd，1数据线，1校验线
//即插即用

interface USB{
	//属性--静态常量
	public static final int line=4;//4个引脚
	double weidth=8.2;//宽度,省略public static final
	double height=5.1;//高度,省略public static final
	 //方法--抽象，省略abstract
	//1-抽象方法 
	void inUse();//即插即用
	 //2-默认方法
	default void fun1(){
		//方法体
	}
	//3-静态方法
	static void fun2(){
		//方法体
	}
	
}

interface Disk{
	
}
//和继承类似
//接口实现
class USBLight implements USB{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("usb发光");
	}
	
}

class USBFun implements USB{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("usb风扇转动");
	}
	
}
//接口可以多实现，有多个接口做父类，同时还可以继承
class IO{}

class USBDisk extends IO implements USB,Disk{

	@Override
	public void inUse() {
		// TODO Auto-generated method stub
		System.out.println("u盘传输数据");
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
