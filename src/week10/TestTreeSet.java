package week10;


import java.util.Comparator;
import java.util.TreeSet;

import week09.Book;

//�Զ���Ƚ���
class MyCompara implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.isbn.compareTo(o2.isbn);
	}
	
}
public class TestTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Book> bookTreeSet=new TreeSet<Book>( new MyCompara());//���Զ���ıȽ�����Ϊ����
		
		bookTreeSet.add(new Book("1001", "c����"));
		bookTreeSet.add(new Book("1006", "python����"));
		bookTreeSet.add(new Book("1003", "Java����"));
		
		for(Book book:bookTreeSet){
			System.out.println(book);
		}

	}

}
