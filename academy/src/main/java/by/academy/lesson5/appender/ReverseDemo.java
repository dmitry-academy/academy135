package by.academy.lesson5.appender;

public class ReverseDemo {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("abcdef");

		System.out.println(s);
		s.reverse();
		System.out.println(s);
	}
}