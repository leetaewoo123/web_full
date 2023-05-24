package ch06;

public class Company {
	private static Company instance = new Company();
	private Company() {}
	public static Company getInstance() {
		if (instance == null) { //객체가 만들어져있지 않으면
			instance = new Company();
		}
		return instance;
	}
}
