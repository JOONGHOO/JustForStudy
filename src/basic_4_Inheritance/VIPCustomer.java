package basic_4_Inheritance;

class VIPCustomer extends Customer{
    int agentID;
    double saleRatio;
    
//    public VIPCustomer() {
//    	System.out.println("VIPCustomer Constructor호출");
//    	
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//    }
    
    public VIPCustomer(String customerName, int agentID) {
    	super(customerName);

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        
        System.out.println("VIPCustomer Constructor호출");
    }
    
    @Override
    public int calcPrice(int price) {
    	bonusPoint += price * bonusRatio;
    	return price - (int)(price * saleRatio);
    }
}