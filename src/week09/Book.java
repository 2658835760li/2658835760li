package week09;

public class Book /*implements Comparable<Book>*/{
	public String isbn;//书号,唯一不重复的编号
	public String name;//书名
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
//	@Override
//	public int compareTo(Book o) {
//		// TODO Auto-generated method stub
//		//比较2个对象的大小.当前对象this,另一个对象，参数传递来的(Book o)
//		//返回值，相等--0；大于---正整数；小于---负整数
//		return this.isbn.compareTo(o.isbn);
//	}
}