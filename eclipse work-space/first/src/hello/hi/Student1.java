package hello.hi;

import hello.hi.Student;

public class Student1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "홍길동";
		Student student2 = new Student();
		student2.studentName = "이순신";
		System.out.println(student1);
		System.out.println(student2);
		
		String str1 = "Hello2";
		String str2 = "Hello";
		String str3 = new String("Hello2");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		if(str1 == str2) {
			System.out.println("str1 == str2");
		}
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str2)");
		}
		if(str1 == str3) {
			System.out.println("str1 == str3");
		}
		if(str1.equals(str2)) {
			System.out.println("str1.equals(str3)");
		}
	}

}
