package week03;

public class TestaaryBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ary=new int[5];//0--4
		ary[0]=100;
		ary[1]=200;
		//ary[10]=20;//语法不检测
		System.out.println(ary);//引用类型，数组名存放的是数组的首地址
		final int a=10;
		//a=20;
		System.out.println(a);//使用变量名代表使用变量的值
	}

}
