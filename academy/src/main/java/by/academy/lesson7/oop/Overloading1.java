package by.academy.lesson7.oop;

import java.util.Arrays;

public class Overloading1 {

	void test(int a) {
		System.out.println("int a: " + a);
	}

	void test(double a) {
		System.out.println("double a: " + a);
	}

	void test(float a) {
		System.out.println("float a: " + a);
	}

	void test(int a, double b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Int + Double");
	}

	int test(double a, int b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("Double + Int");
		return 1;
	}

	int test(char a, int b) {
		System.out.println("a и b: " + a + " " + b);
		System.out.println("char + Int");
		return 1;
	}

	void test(int a, int b, String s) {
		System.out.println("a и b: " + a + " " + b);
	}

	void test(String s1, String s2, String s3) {
		System.out.println("Не var args");
	}

	void test(int... ints) {
//		strings[0] = "sdasd";
		System.out.println("Начало выполнения test(String... s)");
		for (int s : ints) {
			System.out.println(s);
		}
		System.out.println("Конец выполнения test(String... s)");
	}

	void test(String... strings) {
//		strings[0] = "sdasd";
		System.out.println("Начало выполнения test(String... s)");
		for (String s : strings) {
			System.out.println(s);
		}
		System.out.println("Конец выполнения test(String... s)");
	}

	public static void main(String... args) {
		Overloading1 ob = new Overloading1();
		String[] arr = { "1", "2", "3" };

		ob.test(10);
		ob.test(10.0d);
		ob.test(10.0f);
		ob.test(arr);
		ob.test(10, 20.0);
		ob.test(10, 20, "s");
//		ob.test("1", "2", "3", "m");
		System.out.println(Arrays.toString(arr));
	}
}