package Basic_2_Gugudan;

public class Gugudan {
    public static int[] tempArr = new int[] {1,2,3,4,5,6,7,8,9};
	
    public static void main(String[] args) {
//    	test1();
//    	test2();
    	test3();
    }
    
    //한줄씩
    protected static void test1() {
		for(int dan : tempArr) {
    		int[] result = new int[9];
        	
        	for(int i = 0; i<result.length; i++) {
        		result[i] = (i+1) * dan;
        	}
        	
        	for(int i : result) {
        		System.out.println(i);
        	}
        	System.out.println("---------");
    	}
    }
    
    //단씩
    protected static void test2() {
    	for(int dan : tempArr) {
    		for(int val : tempArr) {
    			System.out.print(val+"*"+dan+"="+(dan*val) + "\t");
    			if(val==9) System.out.println("");
    		}
    	}
    }
    
    //메서드나눠서
    protected static void test3() {
    	for(int i=2; i<=9; i++) {
    		print(calculate(i));
    	}
    }
    
    protected static int[] calculate(int dan) {
    	int[] result = new int[9];
    	for(int val : new int[] {0,1,2,3,4,5,6,7,8}) {
    		result[val] = dan * (val+1);
    	}
    	return result;
    }
    
    protected static void print(int[] result) {
    	for(int i=0; i<result.length; i++) {
    		System.out.println((result[i]));
    	}
    }
}
