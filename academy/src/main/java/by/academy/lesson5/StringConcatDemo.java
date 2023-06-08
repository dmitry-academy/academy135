package by.academy.lesson5;

public class StringConcatDemo {

	public static void main(String[] args) {
		String str = "Hello"; // string pool
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";
		String str5 = "Hello";
		
		str = str + " " + "Java";
		System.out.println(str);
		// Hello Java
		// Hello JavaJava
		str = str.concat("Java");
		
		String objString = new String("asdasd"); // heap

		System.out.println(str);

	}

}
