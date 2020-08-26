package misc;

public class B {

	public static final String a = "B-xyz";
	public static String b = "B-abcd";

	static{
		System.out.println("inside static B..");
	}
	
	 static void m1(){
		System.out.println("inside B.m1()....");
	}
	
	private static void m2(){
		System.out.println("inside B.m2()....");
	}
}
