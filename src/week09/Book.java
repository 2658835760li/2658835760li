package week09;

public class Book /*implements Comparable<Book>*/{
	public String isbn;//���,Ψһ���ظ��ı��
	public String name;//����
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
//	@Override
//	public int compareTo(Book o) {
//		// TODO Auto-generated method stub
//		//�Ƚ�2������Ĵ�С.��ǰ����this,��һ�����󣬲�����������(Book o)
//		//����ֵ�����--0������---��������С��---������
//		return this.isbn.compareTo(o.isbn);
//	}
}