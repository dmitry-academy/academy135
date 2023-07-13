package by.academy.lesson16.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Double> marks = new HashMap<>();
		// mutable objects
		Map<String, Double> marks1 = new HashMap<>();

		System.out.println(marks.isEmpty());

		marks.put("Petrov", 9.0);
		marks.put("Sidorov", 8.0);
		marks.put("Bashirov", 7.0);

		System.out.println(marks.isEmpty());

		if (marks.containsKey("Petrov")) {
			Double newValue = (marks.get("Petrov") + 6.0) / 2;
			Double oldValue = marks.put("Petrov", newValue);
			System.out.println("old value for Petrov: " + oldValue);
		} else {
			marks.put("Petrov", 6.0);
		}

		for (String key : marks.keySet()) {
			System.out.println(key + ": " + marks.get(key));
		}

		for (Double value : marks.values()) {
			System.out.println(value);
		}

		for (Map.Entry<String, Double> entry : marks.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		marks1.putAll(marks);
		System.out.println(marks1.isEmpty());

		marks.remove("Petrov");

		for (String key : marks.keySet()) {
			System.out.println(key + " : " + marks.get(key));
		}
		System.out.println(marks.size());
		System.out.println(marks.get("Petrov"));

//		WrongHashCat cat1 = new WrongHashCat("вася");
//		Map<WrongHashCat, Integer> hashMap = new HashMap<>();
//		hashMap.put(cat1, 1);
//		hashMap.put(null, 2);

//		System.out.println(hashMap.get(null));
//		hashMap.put("Иванов2", 1.0);
//		hashMap.put("Петров", 123.22);
//		hashMap.put("Сидоров", 1378.00);
//
//		WrongHashCat cat1 = new WrongHashCat("вася");
//		WrongHashCat cat2 = new WrongHashCat("барсик");
//		WrongHashCat cat3 = new WrongHashCat("платон");
//		WrongHashCat cat4 = new WrongHashCat("кузя");
//		WrongHashCat cat5 = new WrongHashCat("вася");
////		WrongHashCat cat6 = new WrongHashCat("вася");
//		
//		Map<WrongHashCat, Integer> hashMap1 = new HashMap<>();
//
//		hashMap1.put(cat1, 1);
//		hashMap1.put(cat2, 2);
//		hashMap1.put(cat3, 3);
//		hashMap1.put(cat4, 4);
//		hashMap1.put(cat5, 5);
//
//		for (WrongHashCat key : hashMap1.keySet()) {
//			System.out.print(key + ": ");
//			System.out.println(hashMap1.get(key));
//		}

	}
}