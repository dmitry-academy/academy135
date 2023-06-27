package by.academy.package12;

import java.io.Serializable;

public class Dog extends Animal implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;

	public Dog(String name) {
		super(name);
	}

	@Override
	public Dog clone() {
		return new Dog(name);
	}

}
