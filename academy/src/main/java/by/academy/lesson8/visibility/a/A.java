package by.academy.lesson8.visibility.a;

public class A {

	private String privateVariable;
	protected String protectedVariable;
	public String publicVariable;
	String defaultVariable;

	public void test() {
		System.out.println(privateVariable);
		System.out.println(protectedVariable);
		System.out.println(publicVariable);
		System.out.println(defaultVariable);
	}

	public static void staticTest() {
		System.out.println("static test A");
	}

	public void sleep() {
		System.out.println("sleep from A");
	}
}
