package by.academy.lesson5;

public class IsEmptyBlankStringDemo {

	public static void main(String[] args) {
		System.out.println("    ".isBlank());
		System.out.println("".isBlank());
		
		System.out.println("    ".isEmpty());
		System.out.println("".isEmpty());
		
		System.out.println("123".isEmpty());
		System.out.println("123".isBlank());
	}
	
}
