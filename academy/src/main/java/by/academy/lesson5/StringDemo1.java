package by.academy.lesson5;

public class StringDemo1 {

	public static void main(String[] args) {
		// tEsT@GoOgLe.CoM
		// test@google.com
//		String test = "tEsT@GoOgLe.CoM";
//		String userInput = "test@google.com";
//		System.out.println(test.equalsIgnoreCase(userInput));

		System.out.println("foobar".equals("FOOBAR"));
		System.out.println("foobar".equalsIgnoreCase("FOOBAR"));
		System.out.println("1-------");
		System.out.println("Foobar".startsWith("Foo"));
		System.out.println("Foobar".startsWith("cat"));
		System.out.println("2-------");
		System.out.println("Foobar".endsWith("bar"));
		System.out.println("Foobar".endsWith("cat"));
		System.out.println("3-------");
		System.out.println("Foobar".contains("oo"));
		System.out.println("Foobar".contains("cat"));
		System.out.println("4-------");
		System.out.println("Hello world!!!".regionMatches(6, "worl", 0, 2)); //wo
		System.out.println("Hello world!!!".regionMatches(7, "world", 1, 4)); //orld 
	}

}
