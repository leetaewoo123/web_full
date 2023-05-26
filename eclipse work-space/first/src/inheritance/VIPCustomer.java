package inheritance;

public class VIPCustomer extends Customer{
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName) {
		// 부모클래스가 디폴트 생성자가 없을 경우 자식클래스에서 무조건 부모의 생성자를 호출해야한다.
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		agentID = 123;
		System.out.println("VIPCustomer() 생성자 호출");
	}
	public int getAgentID() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo()+ "담당 상담원 아이디 : " + agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		return super.calcPrice(price);
	}
	
	
}
