package by.academy.lesson7.oop;

public class VarArgs2 {

	static void test(double array) {
		System.out.println("double array");

		test(1, 1, 23, 12, 31, 23, 12, 3, 123, 12, 3);
	}

	public static void test1(int i) {
		System.out.println(i);
	}

//	static void test(double... array) {
//		System.out.println("test(double... array)");
//		System.out.println("Количество аргументов: " + array.length);
//		for (double a : array) {
//			System.out.print(a + " ");
//		}
//		System.out.println();
//	}

	static void test(int test, int... array) {
		System.out.println(test);
		System.out.println("test(int... array)");
		System.out.println("Количество аргументов: " + array.length);
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	static void test(double i, double... array) {
		System.out.println(i);
		System.out.println("test(double... array)");
		System.out.println("Количество аргументов: " + array.length);
		for (double a : array) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	static void test(int a) {
		System.out.println("test(int a)");
	}

	public static void main(String[] args) {
//		test();
		test(3);
		test(1.0);
		test(1, 2);
		test(1, 2.2);
	}
}