package by.academy.lesson9.interfaces.defaults;

public interface B {

	default void someMethod() {
		System.out.println("Some method B");
	}

	default void someMethod(Integer i) {
		System.out.println("Some method B" + i);
	}
}
