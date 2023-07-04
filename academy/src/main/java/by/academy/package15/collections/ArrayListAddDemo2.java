package by.academy.package15.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo2 {
	public static void main(String... args) {
		List<String> arrayList1 = new ArrayList<>();
		List<String> arrayList2 = List.of("1", "2");

		//	arrayList2.set(0, "test");

		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		arrayList1.add("D");
		arrayList1.add("E");
		arrayList1.add("F");
		System.out.println("arrayList1 before adding " + arrayList1);

		arrayList1.addAll(3, arrayList2);
		System.out.println("arrayList1 after adding " + arrayList1);

		arrayList1.clear();
		System.out.println("arrayList1 after clear " + arrayList1);
	}
}
