package by.academy.lesson9.inheritance;

public class Cat extends Animal {

	private double weight;

	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking...");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

}
