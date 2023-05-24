package by.academy.lesson4;

public class Return2 {
	public static void main(String[] args) {
//		double d = getRandomValue(3);
//		System.out.println(d);

		
		boolean result = lessThan(0.002, 0.0021, 0.0001);
		boolean result1 = (0.0021 - 0.002) > 0.0001;
		System.out.println(result);
		
	}

	public static double getRandomValue(int i) {
		return Math.random() * i;
	}

	public static boolean lessThan(double a, double b, double epsilon) {
		return b - a > epsilon;
	}
}