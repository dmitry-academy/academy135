package by.academy.package12;

public class Animal {

	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	public void talk() {
		System.out.println(name + " talking...");
	}

	public void walk() {
		System.out.println(name + " walking...");
	}

	public void sleep() {
		System.out.println(name + " sleeping...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
