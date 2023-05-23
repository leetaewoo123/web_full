package hello.hi;

public class Student {
	// 멤버 주소 (인스턴스 변수)
	int studentId;		//학번
	public String studentName; //학생 이름
	int grade;			//학년
	String address;		//주소
	
	public void showStudentInfo() {
		System.out.println(studentName + "," + "address");
	}
	
	public String getStudentName() {
		return studentName;
	}
	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
