package week10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> infoMap=new HashMap<String, String>();
		//用户的登录信息，用户名name="tom",密码passsword="1234"
		infoMap.put("name","tom");//key=name,value=tom
		infoMap.put("name","jerry");//key=name,value=jerry//重复数据，覆盖
		infoMap.put("passsword", "1234");//key=passsword,value=1234
		//取数据
		System.out.println(infoMap.get("name"));;//根据关键字name回去对应的value
		System.out.println(infoMap.get("passsword"));;//根据关键字name回去对应的value
		//遍历
		System.out.println("1-------------");
		//[1]找到Map种所有的关键字--set集合，遍历set集合get（key）---value
		Set keySet=infoMap.keySet();//Map种所有的关键字
		for(Object obj:keySet){
			System.out.println(obj);//是map中数据的key
			System.out.println(infoMap.get(obj));//value
		}
		System.out.println("2-------------");
		//【2】获取到Map中的所有数据（单列的数据类型Map.Entry）--set集合
		Set<Map.Entry<String, String>> entrySet=infoMap.entrySet();
		for(Map.Entry entry:entrySet){
			System.out.println(entry.getKey());//key
			System.out.println(entry.getValue());//value
		}
		System.out.println("3-------------");
		//[3]lamda表达式
		infoMap.forEach((k,v)->System.out.println(k+"\r\n"+v));
		System.out.println("4-------------");
		//[4]获取到Map中k-v，Map中所有的value数据放到集合set
		for (Object obj:infoMap.values()) {
			System.out.println(obj);
		}

	}

}
