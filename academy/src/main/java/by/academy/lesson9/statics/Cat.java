package by.academy.lesson9.statics;

public class Cat {

	static String color;
	static long count = 0;
	long countNotStatic = 0;

	String name;

	{

	}

	public Cat() {
		super();
		count++;
		countNotStatic++;
	}

	public static void innerMethod() {

	}

	public static void test() {
		System.out.println("TEST");
		innerMethod();
	}
}
