package by.academy.lesson2;

public class CastingDemo {

	// this method do something cool
	public static void main(String[] args) {
		// this method do something cool
		int i = 128; // -2^31 .. (2^31)-1
		byte b = 22; // -128 ... 127
//		b = (byte) i;
//		System.out.println(b);
//		int maxInt = Integer.MAX_VALUE;
//		maxInt = maxInt + 1;
//		System.out.println(maxInt);

		i = b;
		System.out.println(i);

		double d1 = 5.9;

		int i1 = (int) d1;
		System.out.println(i1);
		System.out.println(Math.ceil(5.4));
		System.out.println(Math.floor(5.6));
		System.out.println(Math.round(5.6));

		System.out.println(5 + 5);
		System.out.println(5.5 + 5);
		System.out.println(5 + 5.5);
		System.out.println(5.5 + 5.5);

		System.out.println(sum(5, 5.5));
	}

	public static double sum(int a, double b) {
		return a + b;
	}

	public static int sum1() {
		return (int) 3.2;
	}

}
