package by.academy.lesson16.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAddDemo {
	public static void main(String[] args) {

		List<String> arrayList = new ArrayList<>();

//		String [] arr = new String[10];
//		arr[0] = "C";

		System.out.println("Начальный размер arrayList: " + arrayList.size());

		arrayList.add("C");
		arrayList.add("E");
		arrayList.add("B");
		arrayList.add("D");
		arrayList.add("F");
		arrayList.add("F");
		System.out.println("Содержимое arrayList: " + arrayList);
		arrayList.add(1, "A2");

		System.out.println("Old value: " + arrayList.set(0, "C2"));
		System.out.println("Old value: " + arrayList.set(0, "C3"));

		System.out.println("Размер arrayList после добавления: " + arrayList.size());
		System.out.println("Содержимое arrayList: " + arrayList);

		System.out.println(arrayList.get(0));

	}
}