package by.academy.lesson5;

import java.util.Arrays;

public class StringJoinDemo {
	public static void main(String... args) {
//		String result = String.join("|", "foobar", "foo", "bar", "aqseqw", "qweqwe");
//		System.out.println(result);

		String[] array = { "foobar", "foo", "bar" };
		String result = "";
		for (int i = 0; i < array.length; i++) {
			result = result + array[i];
			if (i != array.length - 1) {
				result = result + ",";
			}
		}
		System.out.println(result);
	}

}