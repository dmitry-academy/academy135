package by.academy.lesson9.interfaces.defaults;

public class ABImpl implements A, B {

	@Override
	public void someMethod() {
		A.super.someMethod();
		B.super.someMethod();
	}


}
