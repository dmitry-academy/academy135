package by.academy.package15.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();

		arrayList.add("C");
		arrayList.add("A");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		arrayList.add(1, "A2");
		arrayList.set(0, "C2");

		System.out.println("arrayList: " + arrayList);
		System.out.println("Size of arrayList after adding: " + arrayList.size());

		arrayList.remove("F");
		arrayList.remove(2);

		System.out.println("Size of arrayList after removal: " + arrayList.size());
		System.out.println("arrayList: " + arrayList);
	}
}
