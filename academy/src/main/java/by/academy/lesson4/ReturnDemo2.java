package by.academy.lesson4;

public class ReturnDemo2 {

	public static void main(String... args) {
		printFirstFiveElements(4);
		System.out.println("Hello from main!");
	}

	static void printFirstFiveElements(int count) {
		for (int i = 1; i <= count; i++) {
			System.out.println(i);
			if (i >= 5) {
				return;
			}
		}
		System.out.println("ALALALA");
	}
}
