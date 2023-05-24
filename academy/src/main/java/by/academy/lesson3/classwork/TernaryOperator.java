package by.academy.lesson3.classwork;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		String result = x < 0 ? "negative" : x > 0 ? "positive" : "zero";
		System.out.println(result);

		sc.close();

	}

}
