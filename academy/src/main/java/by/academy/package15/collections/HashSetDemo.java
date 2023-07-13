package by.academy.package15.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>();

		hashSet.add("one");
		hashSet.add("two");
		hashSet.add("three");
		hashSet.add("four");
		hashSet.add("five");
		hashSet.add("five");
		System.out.println(hashSet.add("TEST"));
		System.out.println(hashSet.add("five"));
		System.out.println(hashSet.add("one"));

		System.out.println(hashSet);

//		WrongHashCat c1 = new WrongHashCat("cat1");T
//		WrongHashCat c2 = new WrongHashCat("cat2");
//		WrongHashCat c3 = new WrongHashCat("cat3");
//		WrongHashCat c4 = new WrongHashCat("cat4");
//		WrongHashCat c5 = new WrongHashCat("cat5");
//		WrongHashCat c6 = new WrongHashCat("cat6");
//
//		Set<WrongHashCat> hashSetCats = new HashSet<>();
//		hashSetCats.add(c1);
//		hashSetCats.add(c2);
//		hashSetCats.add(c3);
//		hashSetCats.add(c4);
//		hashSetCats.add(c5);
//		hashSetCats.add(c6);

//		System.out.println(hashSetCats.size());
//		System.out.println(hashSetCats);

	}
}