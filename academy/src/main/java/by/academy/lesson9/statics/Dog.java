package by.academy.lesson9.statics;

public class Dog {

	private String name;
	private static int age;
	private String[] toys;

	static {
		age = 10;
		System.out.println("static blok Dog");
	}

	{
		toys = new String[10];
		name = "Bobik";
		System.out.println("blok Dog");
		toys[0] = "Bone";
		toys[1] = "Bone 1";
	}

	public Dog() {
		super();
		System.out.println("constructor Dog");
	}
}
