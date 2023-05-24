package by.academy.lesson4;

public class BreakDemo {
//	Найти первое число из отрезка [17,28], которое нацело делится на 13;

	public static void main(String[] args) {

		int i = 17;
		while (i <= 28) {
			if (i % 13 == 0) {
				System.out.println("First number is : " + i);
				break;
			}
			i++;
			System.out.println(i);
		}
		System.out.println("------------------");
		for (int j = 17; j <= 28; j++) {
			if (j % 13 == 0) {
				System.out.println("First number is : " + j);
				break;
			}
			System.out.println(j);
		}

	}

}
