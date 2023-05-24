package by.academy.lesson3.classwork;

import java.util.Scanner;

public class IfElseSimpleDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if (x < 0) {
			System.out.println("negative");
		} else {
			System.out.println("positive");
		}
		sc.close();

	}

}
