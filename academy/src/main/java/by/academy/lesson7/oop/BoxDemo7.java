package by.academy.lesson7.oop;

public class BoxDemo7 {
	public static void main(String[] args) {
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		Box myBox3 = myBox2;

		double volume;

		// присвоить значения переменным экземпляра myBox1
		myBox1.width = 10;
		myBox1.height = 20;
		myBox1.depth = 15;

		// присвоить другие значения переменным экземпляра myBox2
		myBox2.width = 3;
		myBox2.height = 6;
		myBox2.depth = 9;

		// присвоить другие значения переменным экземпляра myBox2
		myBox3.width = 5;
		myBox3.height = 15;
		myBox3.depth = 25;

		// рассчитать объем первого параллелепипеда
		volume = myBox1.width * myBox1.height * myBox1.depth;
		System.out.println(myBox1);
		System.out.println("Value equals " + volume);

		// рассчитать объем второго параллелепипеда
		volume = myBox2.width * myBox2.height * myBox2.depth;
		System.out.println(myBox2);
		System.out.println("Value equals " + volume);

		// рассчитать объем третьего параллелепипеда
		volume = myBox3.width * myBox3.height * myBox3.depth;
		System.out.println(myBox3);
		System.out.println("Value equals " + volume);
	}
}