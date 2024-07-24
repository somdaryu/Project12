package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		list.add(new Book(100,"가"));
		list.add(new Book(200,"나"));
		list.add(new Book(300,"다"));
		
		System.out.println(list);
		for(Book book : list) {
			System.out.println(book);
		}
		
//		int i=0;
//		while(i<3) {
//			list.remove(0);
//			i++;
//		}
		list.clear();
		System.out.println(list);
	}

}

class Book {
	int pageNum;
	String bookName;
	public Book(int pageNum, String bookName) {
		super();
		this.pageNum = pageNum;
		this.bookName = bookName;
	}
	@Override
	public String toString() {
		return "Book [pageNum=" + pageNum + ", bookName=" + bookName + "]";
	}
	
	
	
	
}