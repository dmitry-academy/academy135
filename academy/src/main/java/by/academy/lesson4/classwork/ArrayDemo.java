package by.academy.lesson4.classwork;

import java.util.Arrays;
import java.util.Random;

import by.academy.lesson2.Man;

public class ArrayDemo {

	public static void main(String[] args) {

		int[] array = new int[10];

		String[] strings = new String[5];
		strings[0] = "String1";
		
		Man[] cats = new Man[1];

		System.out.println(Arrays.toString(array));
		System.out.println(array.length);
		// 0...9

//		array[0] = 999;
//		array[1] = 899;
//		array[2] = 799;
//		array[3] = 699;
//		array[4] = 599;
//		array[5] = 499;
//		System.out.println(array[0]);

		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			array[i] *= 10;
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();

		System.out.println(array[10]);
	}

}
