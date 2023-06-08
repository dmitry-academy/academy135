package by.academy.lesson5;

import by.academy.lesson2.Man;

public class ValueOfDemo {

	public static void main(String[] args) {
		Man man = new Man();
		System.out.println(String.valueOf(man));

		int i = 123;
		String s1 = String.valueOf(i);
		String s2 = String.valueOf(123);
		System.out.println(s1);
		System.out.println(String.valueOf(123.13));

	}

}
