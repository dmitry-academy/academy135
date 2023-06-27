package by.academy.package12;

public class BoxDemo {
	public static void main(String... args) {

		Box<Cat> catBox = new Box<>();
		Box<Cat> cat2Box = new Box<>();

		Box<Dog> dogBox = new Box<>();
//		Box<Integer> intBox = new Box<>();

		catBox = cat2Box;
//		catBox = dogBox; - not working
//		Box<int> intBox = new Box<>(); - not working

		Box<Cat> catBox3 = new Box<>();
		catBox3.addItem(new Cat("Pushok"));
		catBox3.addItem(new Cat("Betty"));
		catBox3.addItem(new Cat("Barsik"));

		catBox3.sleepAll();
	}
}
