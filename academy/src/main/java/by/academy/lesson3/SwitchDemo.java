package by.academy.lesson3;

public class SwitchDemo {
	public static void main(String... args) {

		int i = 99;

		if (i == 1) {
			System.out.println("число 1");
		} else if (i == 2) {
			System.out.println("число 2");
		}

		switch (i) {
		case 1:
			System.out.println("число 1");
		case 2:
			System.out.println("число 2");
		case 3:
			System.out.println("число 3");
		case 4:
			System.out.println("число 4");
		case 6:
			System.out.println("число 6");
		default:
			System.out.println("default");
		}
	}
}
