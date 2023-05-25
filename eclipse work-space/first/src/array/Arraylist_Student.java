package array;

import java.util.ArrayList;

public class Arraylist_Student {
	int studentID;
	String studentName;
	ArrayList<Arraylist_Subject> subjectList;
	
	public Arraylist_Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.subjectList = new ArrayList<Arraylist_Subject>();
	}
	
	public void addSubject(String name, int score) {
		Arraylist_Subject subject = new Arraylist_Subject();
		subject.setName(name);
		subject.setScorePoint(score);
		subjectList.add(subject);
	}
	
	public void showStudentinfo() {
		int total = 0;
		for(Arraylist_Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " + s.getScorePoint() + "입니다.");
		}
		System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
	}
	
	
}
