package by.academy.lesson5.classwork;

public class WrapperDemo {

	public static void main(String[] args) {
		Double positiveD = 2.6;
		Double negativeD = -2.6;

		Double zeroD = 0.0;

		Double result = positiveD / zeroD;
		System.out.println(result);

		result = negativeD / zeroD;
		System.out.println(result);

		result = zeroD / zeroD;
		System.out.println(result);

		System.out.println(Double.NaN);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		double p = 2.2;
		Double doublObject = Double.valueOf(p);
		Double doubleFromString = Double.valueOf("2.2");
		// String s = "2.2";

		System.out.println(doublObject);
		System.out.println(doublObject.getClass());

		System.out.println(doubleFromString);
		System.out.println(doubleFromString.getClass());

	}

}
