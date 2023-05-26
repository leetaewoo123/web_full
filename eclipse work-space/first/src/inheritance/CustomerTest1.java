package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010,"이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		// 객체 참조 변수는 부모 클래스 타입, 실제로는 자식 클래스로 인스턴스 생성
		VIPCustomer customerKIM = new VIPCustomer(10020, "김유신"); // 묵시적 형변환
		
		customerKIM.bonusPoint = 10000;
		System.out.println(customerKIM.showCustomerInfo());
		VIPCustomer vip = (VIPCustomer)customerKIM; // 명시적 형변환(다운캐스팅)
		System.out.println(vip.getAgentID());
		
	}

}
