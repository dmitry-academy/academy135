package by.academy.lesson8.visibility.b;

import by.academy.lesson8.visibility.a.A;

public class B extends A {

	@Override
	public void test() {
		System.out.println(publicVariable);
//		System.out.println(defaultVariable);
//		System.out.println(privateVariable);
		System.out.println(protectedVariable);
	}

	@Override
	public void sleep() {
		System.out.println("sleep from B");
	}

	public static void staticTest() {
		System.out.println("static test B");
	}
}
