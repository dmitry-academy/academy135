package by.academy.lesson9.statics;

public class StaticDemo {

	public static final String GRASS_COLOR = "green";

	public static void main(String[] args) {

		Cat e1 = new Cat();
		Cat e2 = new Cat();
		Cat e3 = new Cat();

		e1.name = "Barsik";
		e2.name = "Elza";

		Cat.color = "Black";
		Cat.color = "Red";

		Cat.color = "White";

		System.out.println(e1.name + " " + e1.color + " " + e1.count + " " + e1.countNotStatic);// ???
		System.out.println(e2.name + " " + e2.color + " " + e2.count + " " + e2.countNotStatic);

		Cat.test();

		System.out.println(Math.PI);
		System.out.println(Math.max(10, 15));
		test();
	}

	public static void test() {

	}

}
