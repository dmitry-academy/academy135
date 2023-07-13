package by.academy.lesson16.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		SortedMap<String, Double> treeMap = new TreeMap<>();

		treeMap.put("A", 3434.34);
		treeMap.put("G", 123.22);
		treeMap.put("L", 1378.00);
		treeMap.put("B", 1378.00);
		treeMap.put("P", 1378.00);
		treeMap.put("C", 1378.00);

		treeMap.forEach((k, v) -> System.out.println(k + ": " + v));
	}
}