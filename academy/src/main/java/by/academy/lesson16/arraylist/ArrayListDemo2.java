package by.academy.lesson16.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		List<String> arrayList1 = new ArrayList<>();
		List<String> arrayList2 = List.of("1", "2");

//		arrayList2.set(0, "test");

		arrayList1.add("A");
		arrayList1.add("B");
		arrayList1.add("C");
		arrayList1.add("D");
		arrayList1.add("E");
		arrayList1.add("F");
		System.out.println("arrayList1 до добавления " + arrayList1);

		arrayList1.addAll(3, arrayList2);
		System.out.println("arrayList1 после добавления " + arrayList1);

		arrayList1.clear();
		System.out.println("arrayList1 после очистки " + arrayList1);

//		arrayList1.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareTo(o2);
//			}
//		});
//
//		System.out.println(arrayList1);
	}
}