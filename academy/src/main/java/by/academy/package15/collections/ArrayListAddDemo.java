package by.academy.package15.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();
		System.out.println("Initial size arrayList: " + arrayList.size());

		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		System.out.println("arrayList: " + arrayList);
		arrayList.add(1, "A2");
		System.out.println("arrayList: " + arrayList);

		System.out.println("Old value: " + arrayList.set(0, "C2"));
		System.out.println("Old value: " + arrayList.set(0, "C3"));

		System.out.println("Size arrayList after adding: " + arrayList.size());
		System.out.println("arrayList: " + arrayList);

		System.out.println(arrayList.get(0));
		System.out.println("arrayList: " + arrayList);

	}
}
