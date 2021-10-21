package week09;

import java.io.StringReader;
import java.util.HashSet;
class Book{
	String isbn;//书号,唯一不重复的编号
	String name;//书名
	public Book(String isbn,String name) {
		// TODO Auto-generated constructor stub
		this.isbn=isbn;
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return isbn+"---"+name;
	}
	//重写equls
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (this==obj) {
			return true;
		}
		if (obj instanceof Book) {
			Book anotherBook=(Book) obj;
			if (this.isbn.equals(anotherBook.isbn)) {
				return true;
			}
		}
		
		return false;
	}
	//重写hashCode
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return isbn.hashCode();
	}
}
public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet bookSet=new HashSet();
		
		bookSet.add(new Book("1001", "c语言"));
		bookSet.add(new Book("1002", "python语言"));
		bookSet.add(new Book("1003", "Java语言"));
		bookSet.add(new Book("1003", "Java语言"));//重复数据
		for (Object obj:bookSet) {
			Book book=(Book) obj;
			System.out.println(book);
		}

	}

}
