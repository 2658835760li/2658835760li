package week08;

import java.util.ArrayList;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ArrayList
		ArrayList aList=new ArrayList();
		//1-添加集合元素
		//任意类型的数据
		aList.add(100);
		aList.add("abcd");
		aList.add(3.14);
		aList.add(new Object());
		//2-获取数据 
		//ary[3]
		int[]ary={1,2,3,4};
		
		//get（下标），数据类型是Object
		int a=(int) aList.get(0);//集合中的第一个元素
		//a=ary[6];//下标越界
		//System.out.println(aList.get(8));// java.lang.IndexOutOfBoundsException
		//遍历集合
		//[1]for
		for(int i=0;i<aList.size();i++){
			System.out.println(aList.get(i));
		}
		//[2]foreach
		System.out.println("----------");
		for(Object obj:aList){
			System.out.println(obj);
		}
		//[3]集合，迭代器遍历
		//点名--考勤巡视员
		System.out.println("----------");
		Iterator iterator=aList.iterator();
		while(iterator.hasNext()){
			//获取迭代器的下一个元素iterator.next()
			//aList.remove(1);//不能删除集合元素
			System.out.println(iterator.next());
		}
		//查找
		ArrayList nameList=new ArrayList ();
		nameList.add("tom");
		nameList.add("jerry");
		nameList.add("kate");
		nameList.add("john");
		nameList.add("sam");
		//在nameList中查找kate，找到显示index=2，没找到index=-1
		int index=-1;
		for(int i=0;i<nameList.size();i++){
			String name=(String) nameList.get(i);//Object
			if(name.equals("kate")){
				index=i;
				break;
			}
		}
		if (index==-1) {
			System.out.println("没找到此人");
		}else {
			System.out.println("找到"+index);
		}

	}

}
