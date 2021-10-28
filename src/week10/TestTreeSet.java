package week10;


import java.util.Comparator;
import java.util.TreeSet;

import week09.Book;

//自定义比较器
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
		TreeSet<Book> bookTreeSet=new TreeSet<Book>( new MyCompara());//将自定义的比较器作为参数
		
		bookTreeSet.add(new Book("1001", "c语言"));
		bookTreeSet.add(new Book("1006", "python语言"));
		bookTreeSet.add(new Book("1003", "Java语言"));
		
		for(Book book:bookTreeSet){
			System.out.println(book);
		}

	}

}
