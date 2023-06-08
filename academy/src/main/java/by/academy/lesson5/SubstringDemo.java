package by.academy.lesson5;

public class SubstringDemo {
	public static void main(String[] args) {
		String s = "Welcome to Minsk!!!".substring(11);
		System.out.println(s);
		// или
		System.out.println("Welcome to Minsk!!!".substring(11));
		System.out.println("Welcome to Minsk!!!".substring(10, 16));

	}
}