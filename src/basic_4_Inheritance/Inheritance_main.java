package basic_4_Inheritance;

import java.util.ArrayList;

public class Inheritance_main {
    public static void main(String[] args) {
//    	//Overriding
//    	Customer customer1 = new Customer("이소룡");
//    	System.out.println("지불 할 금액은 : " + customer1.calcPrice(10000));
//    	System.out.println(customer1.showCustomerInfo());
//    	
//    	System.out.println();
//    	
//    	//Polymorphism(다형성)
//    	Customer customer2 = new VIPCustomer("안중후", 100);
//    	System.out.println("지불 할 금액은 : " + customer2.calcPrice(10000));
//    	System.out.println(customer2.showCustomerInfo());
    	
    	
    	ArrayList<Customer> customerList = new ArrayList<Customer>();
    	Customer customerLee = new Customer("이소룡");
    	Customer customerKim = new Customer("김유신");
    	GoldCustomer customerPark = new GoldCustomer("박지성");
    	GoldCustomer customerSon = new GoldCustomer("손흥민");
    	VIPCustomer customerAhn = new VIPCustomer("안중후", 100);
    	
    	customerList.add(customerLee);
    	customerList.add(customerKim);
    	customerList.add(customerPark);
    	customerList.add(customerSon);
    	customerList.add(customerAhn);
    	
    	System.out.println("==============고객정보==============");
    	for(Customer customer : customerList) {
    		System.out.println(customer.showCustomerInfo());
    	}
    	
    	System.out.println("==============할인율과 보너스 포인트 결과==============");
    	for(Customer customer : customerList) {
    		int cost = customer.calcPrice(10000);
    		
    		System.out.println(customer.getCustomerName() + "님이 " + cost + "를 지불하셨습니다.");
    		System.out.println(customer.showCustomerInfo());
    	}
    }
}