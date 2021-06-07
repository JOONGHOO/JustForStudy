package basic_3_Singleton;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println(s);
		
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2);
		
		//////////////////////////////////////
		TempClass t = new TempClass();
		System.out.println(t);
		
		TempClass t2 = new TempClass();
		System.out.println(t2);
	}
}

class Singleton{
	private static Singleton instance = new Singleton();
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
}

class TempClass{
	
}