package by.academy.lesson19;

public class PrintableDemo {

	public static void main(String[] args) {

		Printable lambda = (s) -> System.out.println(s);

		lambda.print("Test");

	}

}
