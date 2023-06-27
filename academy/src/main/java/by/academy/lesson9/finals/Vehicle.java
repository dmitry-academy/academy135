package by.academy.lesson9.finals;

public  class Vehicle {

	final String color;

	public Vehicle() {
		super();
		this.color = "black";
	}

	public final void test() {
		System.out.println("final method");
	}

}
