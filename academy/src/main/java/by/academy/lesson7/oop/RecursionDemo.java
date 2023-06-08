package by.academy.lesson7.oop;

public class RecursionDemo {

	public static void main(String[] args) {
		int i = 0;
		recursion(0);
	}

	public static void recursion(int i) {
		if (i >= 1000) {
			System.out.println("stop recursion i: " + i);
			return;
		}
		System.out.println("resursion i: " + i);
		recursion(++i);
	}
}
