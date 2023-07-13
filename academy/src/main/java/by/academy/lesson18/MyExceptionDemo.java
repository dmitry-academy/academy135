package by.academy.lesson18;

public class MyExceptionDemo {
	public static void main(String[] args) {
		try {
			compute(20);
			compute(1);
			System.out.println("End try");
		} catch (MyException e) {
			System.out.println("Перехваченное исключение." + e);
		}
	}

	public static void compute(int a) throws MyException {

		System.out.println("Вызван метод compute(" + a + ")");
		if (a > 10) {
			throw new MyException(a, "Some message");
		}
		System.out.println("Нормальное завершение.");
	}
}