package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherDemo {

	public static void main(String[] args) {

		String string = "some text alalala file1.doc, file2.txt.\r\nsome text alalala file3.img. \r\n"
				+ "some text alalala file4.doc. \r\n";
		System.out.println(string);

		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+\\.[a-z]{1,5}");
		Matcher matcher = pattern.matcher(string);
		System.out.println(matcher.matches());

		System.out.println(string.matches("[a-zA-Z0-9]+\\.[a-z]{1,5}"));

		while (matcher.find()) {
			System.out.println("-----------");
			System.out.println("First index: " + matcher.start());
			System.out.println("End index: " + matcher.end());
			System.out.println("Match: " + matcher.group());
		}
	}

}
