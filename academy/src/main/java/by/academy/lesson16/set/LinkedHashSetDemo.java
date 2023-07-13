package by.academy.lesson16.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set<String> linkedHashSet = new LinkedHashSet<>();

		linkedHashSet.add("one");
		linkedHashSet.add("two");
		linkedHashSet.add("three");
		linkedHashSet.add("four");
		linkedHashSet.add("five");
		linkedHashSet.add("one");
		linkedHashSet.add("one");
		linkedHashSet.add("one");
		linkedHashSet.add("one");

		System.out.println(linkedHashSet);

	}
}