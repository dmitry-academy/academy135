package by.academy.lesson3.classwork;

import java.util.Scanner;

public class AlphabetDemo {
	public static void main(String... strings) {

		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);

		if (x == 'a') {
			System.out.println("String starts with a");
		} else if (x == 'b') {
			System.out.println("String starts with b");
		} else if (x == 'c') {
			System.out.println("String starts with c");
		} else if (x == 'd') {
			System.out.println("String starts with d");
		} else if (x == 'f') {
			System.out.println("String starts with f");
		} else if (x == 'e') {
			System.out.println("String starts with e");
		} else {
			System.out.println("String starts with another letter");
		}

		sc.close();
	}
}
