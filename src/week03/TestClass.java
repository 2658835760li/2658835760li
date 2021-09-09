package week03;
/*
 * 商品类
 * 
 * 商品对象的共同特征
 * 编码
 * 价格
 * 名称
 */
//变量名小写字母开头
//类名首字母大写
class Goods{
	//1-共同的属性
	private String code;//编码
	private String name;//名称
	private double price;//价格
	//2-操作---方法=函数
	//展示商品信息
	//返回类型 方法名（参数）{代码}
	//返回类型--方法执行完之后返回的数据类型(retrun带回的数据)
	//returen
	//方法的参数，参数数据是不是确定的数据
	//返回收据 交学费(参数=xf){缴费xf}
	//矿泉水 跑腿（10）{买水，带水返回}
	void show(){
		System.out.println("编码\t\t名称\t\t价格");
		System.out.println(code+"\t\t"+name+"\t\t"+price);
		//return;//不带数据可以省略
	}
	
}
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods product1=new Goods();//类创建对象
		//使用对象，给属性赋值
//		product1.code="1001";
//		product1.name="面包";
//		product1.price=-2.5;//属性可以直接赋值，
		product1.show();

	}

}
