package lesson14.inner;

import java.util.Date;

public class AnotherFood {
	public static void main(String[] args) {

		Date str = new Date() {
			@Override
			public int getDate() {
				return Integer.MIN_VALUE;
			}
		};
		// Ошибка компиляции
//		 potato.fry();
	}
}