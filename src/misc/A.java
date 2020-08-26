package misc;

public class A extends B {
	
	private static final String a = "A-xyz";
	public static String b = "A-abcd";
	
	static{
		System.out.println("inside static A..");
	}
	
	public static void m1(){
		System.out.println("inside A.m1()....");
	}
	
	static void m2(){
		System.out.println("inside A.m2()....");
	}

	public static void main(String[] args) {
		System.out.println(A.a);
		System.out.println(A.b);
		//m1();
		//B.m1();
		
	}
}
