package by.academy.lesson18;

public class MultiCatch2 {
	public static void main(String[] args) {
		try {
			int b = 42 / 0;
			int[] c = new int[1];
			c[1] = 6;
		} catch (ArithmeticException e) {
			System.out.println("hohohoh ArithmeticException." + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Eception ArrayIndexOutOfBoundsException." + e);
		} catch (Exception e) {
			System.out.println("I'm handling all exceptions." + e);
		} finally {
			System.out.println("finally");
		}

		System.out.println("after try-catch block.");
	}
}