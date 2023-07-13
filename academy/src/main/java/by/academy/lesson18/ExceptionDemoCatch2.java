package by.academy.lesson18;

public class ExceptionDemoCatch2 {
	public static void main(String[] args) {
		test1();
	}

	public static void test1() {
		test2();
	}

	public static void test7() {
		test8();
	}

	public static void test8() {
		test9();
	}

	public static void test9() {
		try {
			int a = 10;
			int b = 10;
			System.out.println(b / a);
			int[] array = { 1 };
			System.out.println("OK for div");
			System.out.println(array[10]);
			System.out.println("OK for array");
		} catch (ArithmeticException e) {
			System.out.println("ERROR! ArithmeticException");
			System.out.println(e);
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("ERROR! IndexOutOfBoundsException");
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("MAIN METHOD");
	}

	public static void test2() {
		test3();
	}

	public static void test3() {
		test4();
	}

	public static void test4() {
		test5();
	}

	public static void test5() {
		test6();
	}

	public static void test6() {
		test7();
	}
}
