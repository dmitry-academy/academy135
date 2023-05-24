package by.academy.lesson4;

public class Task999 {

	public static void main(String[] args) {
		// Найте сумму трех первых чисел из промежутка [100,10000],
		// которые нацело делятся на 7.
		int result = 0;
		int tries = 0;
		for (int i = 100; i <= 10000; i++) {
			if (i % 7 == 0) {
				result += i;
				tries++;
				System.out.println(i);
				if (tries == 3) {
					break;
				}
			}
		}
		System.out.println("Result:" + result);
	}

}
