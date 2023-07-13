package by.academy.lesson18;

public class FinallyUse {
	// Возврат изнутри try-блока
	public static int procB() {
		try {
			System.out.println("Внутри procB");
			return 1;
		} finally {
			System.out.println("finally для procB ");
			return 100;
		}
	}

	public static void main(String[] args) {

//		try {
//			procA();
//		} catch (Exception e) {
//			System.out.println("Exceptions throwed");
//		} finally {
//			System.out.println("Run everytime");
//		}
//		int i = procB();
//		System.out.println(i);
//		System.out.println("method main");
		procC();
	}

	// Нормальное выполнение try-блока
	public static void procC() {
		try {
			System.out.println("Inside procC");
		} finally {
			System.out.println("finally procC");
		}
		System.out.println("method end for procC ");
	}

	// Выход из метода через исключение
	public static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("demo");
		} finally {
			System.out.println("finally for procA ");
		}
	}

}