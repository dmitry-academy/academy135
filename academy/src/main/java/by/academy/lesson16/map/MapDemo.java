package by.academy.lesson16.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, List<Double>> marks = new HashMap<>();

		System.out.println("Enter number of students:");
		int n = sc.nextInt();
		Random r = new Random();

		for (int i = 0; i < n; i++) {
			System.out.println("Enter last name of the student: ");
			String lastName = sc.next();

			if (!marks.containsKey(lastName)) {
				marks.put(lastName, new ArrayList<>());
			}
			for (int j = 0; j < 10; j++) {
				marks.get(lastName).add(r.nextDouble(10));
			}
		}
		System.out.println("Students: ");
		for (String key : marks.keySet()) {
			System.out.println(key + ": " + marks.get(key));
		}

		sc.close();
	}

}
