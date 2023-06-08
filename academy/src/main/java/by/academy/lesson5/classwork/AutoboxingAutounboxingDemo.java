package by.academy.lesson5.classwork;

public class AutoboxingAutounboxingDemo {

	public static void main(String[] args) {

		Integer i = null;
		// Autoboxing
		System.out.println(test(i));

//		new Integer(i);
//		Integer.valueOf(i);
	}

	public static Integer test(int value) {
		System.out.println(value);
		return value;
	}
}
