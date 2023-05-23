package hello.hi;

public class Student2 {
	// 멤버 주소 (인스턴스 변수)
	public int studentID;		//학번
	private String studentName; //학생 이름
	int grade;			//학년 (default 접근제어자)
	protected String address;		//주소
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName+"님";
	}
	
	


}
