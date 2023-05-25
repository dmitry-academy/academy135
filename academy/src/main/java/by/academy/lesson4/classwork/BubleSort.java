package by.academy.lesson4.classwork;

import java.util.Arrays;

public class BubleSort {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length; i++) {
				if (array[j] > array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}

}
