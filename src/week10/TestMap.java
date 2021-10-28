package week10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> infoMap=new HashMap<String, String>();
		//�û��ĵ�¼��Ϣ���û���name="tom",����passsword="1234"
		infoMap.put("name","tom");//key=name,value=tom
		infoMap.put("name","jerry");//key=name,value=jerry//�ظ����ݣ�����
		infoMap.put("passsword", "1234");//key=passsword,value=1234
		//ȡ����
		System.out.println(infoMap.get("name"));;//���ݹؼ���name��ȥ��Ӧ��value
		System.out.println(infoMap.get("passsword"));;//���ݹؼ���name��ȥ��Ӧ��value
		//����
		System.out.println("1-------------");
		//[1]�ҵ�Map�����еĹؼ���--set���ϣ�����set����get��key��---value
		Set keySet=infoMap.keySet();//Map�����еĹؼ���
		for(Object obj:keySet){
			System.out.println(obj);//��map�����ݵ�key
			System.out.println(infoMap.get(obj));//value
		}
		System.out.println("2-------------");
		//��2����ȡ��Map�е��������ݣ����е���������Map.Entry��--set����
		Set<Map.Entry<String, String>> entrySet=infoMap.entrySet();
		for(Map.Entry entry:entrySet){
			System.out.println(entry.getKey());//key
			System.out.println(entry.getValue());//value
		}
		System.out.println("3-------------");
		//[3]lamda���ʽ
		infoMap.forEach((k,v)->System.out.println(k+"\r\n"+v));
		System.out.println("4-------------");
		//[4]��ȡ��Map��k-v��Map�����е�value���ݷŵ�����set
		for (Object obj:infoMap.values()) {
			System.out.println(obj);
		}

	}

}
