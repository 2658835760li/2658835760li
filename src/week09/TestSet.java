package week09;

import java.util.HashSet;

public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Book> bookSet=new HashSet<Book>();//c++ģ��
		
		bookSet.add(new Book("1001", "c����"));
		bookSet.add(new Book("1002", "python����"));
		bookSet.add(new Book("1003", "Java����"));
		bookSet.add(new Book("1003", "Java����"));//�ظ�����
		//bookSet.add("abcd");//1-
//		for (Object obj:bookSet) {
//			Book book=(Book) obj;
//			System.out.println(book);
//		}
		for (Book book:bookSet) {
			 
			System.out.println(book);
		}

	}

}
