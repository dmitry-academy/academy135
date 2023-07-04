package by.academy.package15.collections;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {

	public static void main(String[] args) {

		// 1 option
		ArrayList<Integer> integers1 = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 100; i++) {
			integers1.add(r.nextInt(10));
		}
		System.out.println(integers1);

		// 2 option
		ArrayList<Integer> integers2 = new ArrayList<>(integers1);
		integers2.add(0, 1000);
		System.out.println(integers2);

		// 3 option
		ArrayList<Integer> integers3 = new ArrayList<>(1);
		integers3.add(11111);
		integers3.add(11111);
		System.out.println(integers3);
	}

}
