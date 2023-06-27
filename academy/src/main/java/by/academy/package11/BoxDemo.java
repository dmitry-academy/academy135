package by.academy.package11;

public class BoxDemo {

	public static void main(String[] args) {
		Box box = new Box();
		box.addItem(3);
		box.addItem(2);
		box.addItem(5);
		box.addItem(7);
		box.addItem(10);

		box.print();
		box.remove(2);
		box.print();
		box.addItem(20);
		box.print();

		System.out.println("element under index 3: " + box.get(3));
	}

}
