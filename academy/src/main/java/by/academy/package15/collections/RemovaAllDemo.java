package by.academy.package15.collections;

import java.util.ArrayList;
import java.util.List;

public class RemovaAllDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("A");
		arrayList.add("F");
		arrayList.add(1, "A2");
		arrayList.set(0, "C2");

		List<String> removeElements = List.of("C2", "A2", "AA", "F", "A");
		System.out.println("arrayList before removeAll: " + arrayList);

		System.out.println(arrayList.removeAll(removeElements));
		System.out.println(arrayList);
		arrayList.remove(arrayList.size() - 1);
		System.out.println(arrayList);
		arrayList.remove("A");
		arrayList.remove(1);
		System.out.println("arrayList after removeAll: " + arrayList);
	}
}
