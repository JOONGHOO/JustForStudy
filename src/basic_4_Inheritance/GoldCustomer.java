package basic_4_Inheritance;

public class GoldCustomer extends Customer{

	public double saleRatio;
	
	public GoldCustomer(String customerName) {
		super(customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
		
		System.out.println("GoldCustomer Constructor호출");
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
