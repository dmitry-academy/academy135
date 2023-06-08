package by.academy.lesson7.oop;

public class BoxDemo1 {
	public static void main(String[] args) {
		Box myBox = new Box();
		// присвоить значение переменным экземпляра mybox

		System.out.println(myBox);

		myBox.width = 11;
		myBox.height = 20;
		myBox.depth = 15;

		System.out.println(myBox);

		// рассчитать объем параллелепипеда
		double volume = myBox.width * myBox.height * myBox.depth;
		System.out.println("Value equals " + volume);

		Box myBox1 = new Box();
		System.out.println(myBox1);
		System.out.println(myBox);

		double volume1 = myBox.getVolume();
		System.out.println("Value equals (method): " + volume1);

	}
}