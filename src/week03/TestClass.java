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
class Goods {
	// 1-共同的属性
	private String code;// 编码
	private String name;// 名称
	private double price;// 价格
	//构造方法,无参数
	public Goods() {
		// TODO Auto-generated constructor stub
		code="10";
		name="noname";
		price=2.0;
	}
	//带参数的构造方法
	public Goods(String code){
		this.code=code;
		name="noname";
		price=2.0;
	}

	// 属性值操作---公开的方法
	// 方法，设置属性值
	// 编码
	public void setCode(String code) {
		// 使用参数code给属性code进行赋值
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

	// 设置价格
	// 方法类型 方法名（参数）{功能代码}
	// 参数---不确定的数据（数据的值不是固定的）

	public void setPrice(double p) {
		// 对属性值进行限制
		if (p > 0) {
			price = p;//
		} else {
			System.out.println("价格必须大于0");
		}

	}

	
	// 方法，获取属性值
	// get方法
	// 方法类型 方法名（参数）{功能代码}
	public double getPrice() {
		return price;
	}

	// 2-操作---方法=函数
	// 展示商品信息
	// 返回类型 方法名（参数）{代码}
	// 返回类型--方法执行完之后返回的数据类型(retrun带回的数据)
	// returen
	// 方法的参数，参数数据是不是确定的数据
	// 返回收据 交学费(参数=xf){缴费xf}
	// 矿泉水 跑腿（10）{买水，带水返回}
	void show() {
		System.out.println("编码\t\t名称\t\t价格");
		System.out.println(code + "\t\t" + name + "\t\t" + price);
		// return;//不带数据可以省略
	}

}

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
		Goods product1 = new Goods();// 类创建对象
		// 使用对象，给属性赋值
		// product1.code="1001";
		// product1.name="面包";
		// product1.price=-2.5;//属性可以直接赋值，
		product1.setPrice(-2.5);
		product1.setCode("1001");
		product1.show();
		System.out.println("价格=" + product1.getPrice());
		Goods product2=new Goods();//new自动调用构造方法，无参数
		Goods product3=new Goods("1002");//调用带参数的构造方法
		product3.show();

	}

}
