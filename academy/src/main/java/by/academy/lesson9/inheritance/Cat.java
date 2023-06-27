package by.academy.lesson9.inheritance;

public class Cat extends Animal {

	@Override
	public void eat() {
		System.out.println("Cat is eating...");
	}

	@Override
	public void walk() {
		System.out.println("Cat is walking...");
	}

}
