package by.academy.package12;

import java.io.Serializable;

public class Cat extends Animal implements Cloneable, Serializable {

	public Cat(String name) {
		super(name);
	}

	public void sayMrr() {
		System.out.println("Mrrrr...");
	}

}
