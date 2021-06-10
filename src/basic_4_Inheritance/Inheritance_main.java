package basic_4_Inheritance;

public class Inheritance_main {
    public static void main(String[] args) {
    	//Overriding
    	Customer customer1 = new Customer("이소룡");
    	System.out.println("지불 할 금액은 : " + customer1.calcPrice(10000));
    	System.out.println(customer1.showCustomerInfo());
    	
    	System.out.println();
    	
    	//Polymorphism(다형성)
    	Customer customer2 = new VIPCustomer("안중후", 100);
    	System.out.println("지불 할 금액은 : " + customer2.calcPrice(10000));
    	System.out.println(customer2.showCustomerInfo());
    	
    }
}