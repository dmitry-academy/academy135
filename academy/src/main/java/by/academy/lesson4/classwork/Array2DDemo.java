package by.academy.lesson4.classwork;

import java.util.Arrays;

public class Array2DDemo {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3 };
		int[][] array2d = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
		int[][][] array3d = { { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } }, { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } } };

		System.out.println(Arrays.toString(array));
		System.out.println(array);
		System.out.println(Arrays.deepToString(array3d));
	}

}
