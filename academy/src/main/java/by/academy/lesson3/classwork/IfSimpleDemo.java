package by.academy.lesson3.classwork;

import java.util.Scanner;

public class IfSimpleDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (!(x == 0)) {
			System.out.println("x not equals 0");
		}

		if (x != 0) {
			System.out.println("x not equals 0");
		}

		sc.close();

	}

}
