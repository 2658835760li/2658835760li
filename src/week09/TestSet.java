package week09;

import java.io.StringReader;
import java.util.HashSet;
class Book{
	String isbn;//���,Ψһ���ظ��ı��
	String name;//����
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
	//��дequls
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
	//��дhashCode
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
		
		bookSet.add(new Book("1001", "c����"));
		bookSet.add(new Book("1002", "python����"));
		bookSet.add(new Book("1003", "Java����"));
		bookSet.add(new Book("1003", "Java����"));//�ظ�����
		for (Object obj:bookSet) {
			Book book=(Book) obj;
			System.out.println(book);
		}

	}

}
