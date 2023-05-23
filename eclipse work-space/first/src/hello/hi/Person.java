package hello.hi;

public class Person {
	String name;	// 이름
	int height;		// 키
	double weight;	// 몸무게
	char gender;    // 성별
	boolean married;// 결혼여부
	
	public Person() { // 디폴트 생성자 (생성자가 하나도 없으면 자동 생성)
		this("이순신"); // 자신의 다른 생성자 호출
		System.out.println("Person() 디폴트 생성자 호출");
		
	}
	public Person(String name) {
		this(name,180); //자신의 생성자 호출
		System.out.println("Person(String name) 생성자 호출");
	}
	
	public Person(String name, int height) {
		this(name,height,60.0); //자신의 생성자 호출
		System.out.println("Person(String name, int height) 생성자 호출");
	}
	public Person(String name, int height, double weight) {
		super(); // 부모 클래스의 생성자 호출 (없으면 자동 생성)
		System.out.println("Person(String name, int height, double weight) 생성자 호출");
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
}
