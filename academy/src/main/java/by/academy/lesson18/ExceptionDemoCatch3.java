package by.academy.lesson18;

public class ExceptionDemoCatch3 {
	public static void main(String[] args) throws MyException {
		test1();
	}

	public static void test1() throws MyException {
		try {
			int a = 0;
			int b = 10;
			System.out.println(b / a);
			int[] array = { 1 };
			System.out.println("OK for div");
			System.out.println(array[10]);
			System.out.println("OK for array");
		} catch (ArithmeticException | IndexOutOfBoundsException e) {
			throw new MyException(999, "Exception catched: " + e.getMessage());
		}
		System.out.println("MAIN METHOD");
	}
}
