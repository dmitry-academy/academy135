package by.academy.lesson18;

public class StackOverflowErrorExample {
	public static void main(String[] args) {
		System.out.println("1");
		main(args);
	}
}