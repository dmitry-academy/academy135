package by.academy.lesson3;

public class SwitchDemo {
	public static void main(String... args) {

		int i = 99;

		if (i == 1) {
			System.out.println("����� 1");
		} else if (i == 2) {
			System.out.println("����� 2");
		}

		switch (i) {
		case 1:
			System.out.println("����� 1");
		case 2:
			System.out.println("����� 2");
		case 3:
			System.out.println("����� 3");
		case 4:
			System.out.println("����� 4");
		case 6:
			System.out.println("����� 6");
		default:
			System.out.println("default");
		}
	}
}
