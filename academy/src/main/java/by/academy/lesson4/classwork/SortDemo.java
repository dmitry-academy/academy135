package by.academy.lesson4.classwork;

import java.util.Arrays;
import java.util.Random;

public class SortDemo {

	public static void main(String[] args) {
		int[] array = new int[10];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}

		System.out.println(Arrays.toString(array));

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

	}

}
