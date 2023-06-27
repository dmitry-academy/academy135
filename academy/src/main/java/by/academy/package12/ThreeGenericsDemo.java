package by.academy.package12;

public class ThreeGenericsDemo {

	public static void main(String[] args) {
		ThreeGenerics<String, Dog, Long> obj = new ThreeGenerics<>("some string", new Dog("super cat"), 123123l);
		obj.printClasses();
	}

}
