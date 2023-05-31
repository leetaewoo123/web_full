package test;

class Book{
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookTitle + "," + bookNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book)obj;
		if(this.bookNumber == book.bookNumber && this.bookTitle.equals(book.bookTitle)) {
			return true;
		}
		return false;
	}
	
}



public class ToStringEx{
	public static void main(String[] args) {
		Book book1 = new Book(200,"개미");
		Book book2 = new Book(200,"개미");
		System.out.println("book1 : "+ book1);
		System.out.println("book2 : "+ book2);
		if(book1.bookNumber == book2.bookNumber && book1.bookTitle.equals(book2.bookTitle)) {
			System.out.println("book1솨 book2는 같다.(== 사용)");
		}
		if(book1.toString().equals(book2.toString())) {
			System.out.println("book1 과 book2는 같다.(equals 사용)");
		}
		System.out.println(book1);
		System.out.println(book1.toString());
	}
}