package by.academy.lesson19.refs;

import java.util.function.Consumer;

import by.academy.lesson9.inheritance.Cat;

public class MethodRef2Demo {

	public static void main(String[] args) {
		Cat c = new Cat();

		System.out.println(c);
		Consumer<Double> s = d -> c.setWeight(d);
		s.accept(9.0);
		System.out.println(c);

		Consumer<Double> s1 = c::setWeight;
		s1.accept(4.0);
		System.out.println(c);

	}

	public static void test(Consumer<Double> s) {
		s.accept(4.0);
	}
}
