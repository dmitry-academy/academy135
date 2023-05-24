package by.academy.lesson4;

public class WhileDemo {

	public static void main(String[] args) {
//		int i = 6;
//
//		while (i < 0) {
//			System.out.println("i=" + i);
//			i++;
//		}
//
//		System.out.println("Result: " + i);

		// Найти первое четно число, большее 20
		int x = 0;
		boolean isWorking = true;
		while (isWorking) {
			if (x % 2 == 0 && x > 20) {
				isWorking = false;
			} else {
				x++;
			}
			System.out.println("x=" + x);
		}
		System.out.println(x);
	}

}
