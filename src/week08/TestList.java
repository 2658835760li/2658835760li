package week08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestList {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//����ArrayList
		ArrayList aList=new ArrayList();
		//1-��Ӽ���Ԫ��
		//�������͵�����
		aList.add(100);
		aList.add("abcd");
		aList.add(3.14);
		aList.add(new Object());
		//2-��ȡ���� 
		//ary[3]
		int[]ary={1,2,3,4};
		
		//get���±꣩������������Object
		int a=(int) aList.get(0);//�����еĵ�һ��Ԫ��
		//a=ary[6];//�±�Խ��
		//System.out.println(aList.get(8));// java.lang.IndexOutOfBoundsException
		//3-��������
		//[1]for
		for(int i=0;i<aList.size();i++){
			System.out.println(aList.get(i));
		}
		//[2]foreachѭ��
		System.out.println("----------");
		
		for(Object obj:aList){
			System.out.println(obj);
		}
		//[3]���ϣ�����������
		//����--����Ѳ��Ա
		System.out.println("----------");
		Iterator iterator=aList.iterator();
		while(iterator.hasNext()){
			//��ȡ����������һ��Ԫ��iterator.next()
			//aList.remove(1);//����ɾ������Ԫ��
			System.out.println(iterator.next());
		}
		//4-����
		ArrayList nameList=new ArrayList ();
		nameList.add("tom");
		nameList.add("jerry");
		nameList.add("kate");
		nameList.add("john");
		nameList.add("sam");
		//��nameList�в���kate���ҵ���ʾindex=2��û�ҵ�index=-1
		int index=-1;
		//for-eachѭ��
		for(Object obj:nameList){
			String name=(String) obj;//obj�з�nameList����ȡ��������
			if(name.equals("kate")){
				//���������ȡ����������kate����¼�������Ԫ�ص��±�
				index=nameList.indexOf(obj);//�ҵ�objԪ���ڼ����е�λ��
				break;
			}
			
		}
		if (index==-1) {
			System.out.println("û�ҵ�����");
		}else {
			System.out.println("�ҵ�"+index);
		}
		//��   indexOf����
		index=nameList.indexOf("kate");
		if(index==-1){
			System.out.println("û�ҵ�����");
		}else {
			System.out.println("�ҵ�"+index );
		}
		nameList.contains("kate");
		/*//forѭ��
		for(int i=0;i<nameList.size();i++){
			String name=(String) nameList.get(i);//Object
			if(name.equals("kate")){
				index=i;
				break;
			}
		}
		
		if (index==-1) {
			System.out.println("û�ҵ�����");
		}else {
			System.out.println("�ҵ�"+index);
		}
		*/
		

	}

}

