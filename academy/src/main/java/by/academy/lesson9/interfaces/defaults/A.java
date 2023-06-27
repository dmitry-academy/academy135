package by.academy.lesson9.interfaces.defaults;

public interface A {

	default void someMethod() {
		System.out.println("Some method A");
	}

	default void someMethod(String s) {
		System.out.println("Some method A" + s);
	}
}
