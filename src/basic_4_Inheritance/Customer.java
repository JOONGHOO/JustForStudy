package basic_4_Inheritance;

//=====================================================
//            외부클래스    하위클래스    동일패키지    내부클래스
//=====================================================
//public         O          O           O          O
//protected      X          O           O          O
//default        X          X           O          O
//private        X          X           X          O
//=====================================================
//protected 패키지달라도 상속받은 관계에 대해서는 허용
//default는 같은 패키지에서만 가능
//=====================================================
//상속에서 클래스 생성과정
//
//하위 클래스가 생성 될 때 상위 클래스가 먼저 생성 됨
//상위 클래스의 생성자가 호출되고 하위 클래스의 생성자가 호출 됨
//하위 클래스의 생성자에서는 무조건 상위 클래스의 생성자가 호출되어야 함
//아무것도 없는 경우 컴파일러는 상위 클래스 기본 생성자를 호출하기 위한 super()를 코드에 넣어 줌
//만약 상위 클래스의 기본생성자가 없는 경우(매개변수가 있는 생성자만 존재하는 경우) 하위 클래스는 명시적으로 상위클래스를 호출해야 함
//=====================================================
public class Customer {
	private static int serialNum = 10000;
	
	private int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
//	public Customer() {
//		System.out.println("Customer Constructor호출");
//		
//		customerID = serialNum++;
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//	}
	
	public Customer(String customerName) {
		this.customerName = customerName;
		customerID = serialNum++;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer Constructor호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "(" + customerID + ") 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}