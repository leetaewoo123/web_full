package array;

import java.util.ArrayList;

public class Arraylist_StudentTest {

	public static void main(String[] args) {
		ArrayList<Arraylist_Student> stu = new ArrayList<Arraylist_Student>();
		
		Arraylist_Student studentLee = new Arraylist_Student(1001, "Lee");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 50);
		stu.add(studentLee);
		Arraylist_Student studentKim = new Arraylist_Student(1002, "Kim");
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 85);
		studentKim.addSubject("영어", 100);
		stu.add(studentKim);

		for(int i=0; i<stu.size(); i++) {
			stu.get(i).showStudentinfo();
			System.out.println("================================");
		}
		for(Arraylist_Student s : stu) {
			s.showStudentinfo();
			System.out.println("================================");
		}
	}

}
