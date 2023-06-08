package by.academy.test;

public class Test1 {

	public static void main(String[] args) {
		printLastChar("I like Java!!!");
		endsWithSign("I like Java!!!");
		startsWithChar("I like Java!!!");
		containsChar("I like Java!!!");
		indexOf("I like Java!!!");
	}

	public static void printLastChar(String s) {// á
		System.out.println(s.charAt(s.length() - 1));
	}

	public static void endsWithSign(String s) { // â
		System.out.println(s.endsWith("!!!"));
	}

	public static void startsWithChar(String s) {// ã
		System.out.println(s.startsWith("I like"));
	}

	public static void containsChar(String s) { // ä
		System.out.println(s.contains("Java"));
	}

	public static void indexOf(String s) { // å
		System.out.println(s.indexOf("Java"));
	}

}
