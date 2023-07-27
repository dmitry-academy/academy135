package by.academy.lesson19.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main(String[] args) {

		Predicate<String> containsA = t -> t.contains("A");
		Predicate<String> containsB = t -> t.contains("B");
		Predicate<String> containsM = t -> t.contains("M");

		if ("ABCD".contains("A") && "ABCD".contains("B")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		System.out.println(containsA.and(containsB).test("ABCD"));
	}
}