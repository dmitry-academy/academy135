package by.academy.lesson3.classwork;

import java.util.Scanner;

import by.academy.lesson2.Man;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name = sc.next();

		System.out.println("Enter hairColor: ");
		String hairColor = sc.next();

		System.out.println("Enter passportNumber: ");
		String passportNumber = sc.next();

		System.out.println("Enter age: ");
		int age = sc.nextInt();

		System.out.println("Enter weight: ");
		double weight = sc.nextDouble();

		System.out.println("Enter heigth: ");
		double heigth = sc.nextDouble();

		Man man = new Man(name, hairColor, passportNumber, age, weight, heigth);
		System.out.println(man);

		sc.close();
	}

}
