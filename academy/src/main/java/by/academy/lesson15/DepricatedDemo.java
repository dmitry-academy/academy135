package by.academy.lesson15;

@Version(info = "", age = 0, defaultParam = "ololo")
public class DepricatedDemo {

	@SuppressWarnings({ "unused", "removal" })
	public static void main(@Version(info = "", age = 0, defaultParam = "ololo") String... args) {
		doSomething();

		Integer i = new Integer(123123);
	}

	@Deprecated
	public static void doSomething() {
		System.out.println("do something");

	}
}
