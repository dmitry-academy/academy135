package by.academy.lesson6;

import java.util.Arrays;

public class RegexDemo5 {
	public static void main(String[] args) {
		String str = "java5tiger  77  java6mustang";
		String[] words = str.split("(\\s+)?\\d+(\\s+)?");
		System.out.print(Arrays.toString(words));
	}
}
