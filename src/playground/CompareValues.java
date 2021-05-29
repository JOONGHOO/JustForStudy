package playground;

public class CompareValues {

	public static void main(String[] args) {
		Integer num1 = new Integer(10);
		Integer num2 = new Integer(10);
		int num3 = 10;
		System.out.println("num1 value / address : " + num1 + " / " + System.identityHashCode(num1));
		System.out.println("num2 value / address : " + num2 + " / " + System.identityHashCode(num2));
		System.out.println("num3 value / address : " + num3 + " / " + System.identityHashCode(num3));
		System.out.println("Compare num1 and num2 using '==' : " + (num1 == num2));
		System.out.println("Compare num1 and num2 using 'equals' : " + (num1.equals(num2)));
		System.out.println("Compare num1 and num3 using '==' : " + (num1 == num3));
		System.out.println("Compare num1 and num3 using 'equals' : " + (num1.equals(num3)));
		System.out.println("------------------------------\n");
		
		String str1 = new String("123");
		String str2 = new String("123");
		System.out.println("str1 value / address : " + str1 + " / " + System.identityHashCode(str1));
		System.out.println("str2 value / address : " + str2 + " / " + System.identityHashCode(str2));
		System.out.println("Compare str1 and str2 using '==' : " + (str1 == str2));
		System.out.println("Compare str1 and str2 using 'equals' : " + (str1.equals(str2)));
		System.out.println("------------------------------\n");
		
		String str3 = "123";
		String str4 = "123";
		System.out.println("str3 value / address : " + str3 + " / " + System.identityHashCode(str3));
		System.out.println("str4 value / address : " + str4 + " / " + System.identityHashCode(str4));
		System.out.println("Compare str3 and str4 using '==' : " + (str3 == str4));
		System.out.println("Compare str3 and str4 using 'equals' : " + (str3.equals(str4)));
		System.out.println("------------------------------\n");
		
		String str5 = "123";
		String str6 = new String("123");
		System.out.println("str5 value / address : " + str5 + " / " + System.identityHashCode(str5));
		System.out.println("str6 value / address : " + str6 + " / " + System.identityHashCode(str6));
		System.out.println("Compare str5 and str6 using '==' : " + (str5 == str6));
		System.out.println("Compare str5 and str6 using 'equals' : " + (str5.equals(str6)));
		
		String str7 = "Hello";
		System.out.println(str7 == "Hello");
		System.out.println(str7.equals("Hello"));
		String str8 = str7;
		System.out.println(str7 == str8);
		
		String str9 = new String(str7);
		System.out.println(str7 == str9);
		System.out.println(System.identityHashCode(str7));
		System.out.println(System.identityHashCode(str9));
		
				
	}
}