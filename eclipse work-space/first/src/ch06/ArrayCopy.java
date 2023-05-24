package ch06;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1, 2, 3, 4, 5};
		System.arraycopy(array1, 0, array2, 1, 4);

		for(int i=0; i<array2.length; i++) {
			System.out.println(array2[i]);
		}
		Book[] book1 = new Book[3];
		Book[] book2 = new Book[3];
		
		book1[0] = new Book("태백산맥","조정래");
		book1[1] = new Book("데미안","헤르만 헤세");
		book1[2] = new Book("어떻게 살 것 인가","유시민");
		System.arraycopy(book1, 0, book2, 0, book1.length);
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();
		}
		book1[0].setBookName("나목");
		book1[0].setAuthor("박완서");
		for(int i=0; i<book2.length; i++) {
			book1[i].showBookInfo();
		}
		for(int i=0; i<book2.length; i++) {
			book2[i].showBookInfo();
		}
		System.out.println(book1[0]==book2[0]);
		
		Book[ ] book3 = new Book[3];
		book3[0] = new Book();
		book3[1] = new Book();
		book3[2] = new Book();
		
		for (int i = 0; i < book1.length; i++) {
			book3[i].setBookName(book1[i].getBookName());
			book3[i].setAuthor(book1[i].getAuthor());
		}
		book1[0].setBookName("나목1");
		book1[0].setAuthor("박완서1");
		
		for(int i=0; i<book2.length; i++) {
			book1[i].showBookInfo();
		}
		for(int i=0; i<book2.length; i++) {
			book3[i].showBookInfo();
		}
	}

}
