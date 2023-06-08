package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	static Pattern pattern = Pattern.compile("[a\\sb]*");

	public static void main(String[] args) {

		String text = "aaaaaaaaaababa   aababbbbb";

		Matcher matcher = pattern.matcher(text);
		boolean b = matcher.matches();
		
//		while (matcher.find()) {
//			System.out.println(text.substring(matcher.start(), matcher.end()));
//			System.out.println("Matcher start: " + matcher.start());
//			System.out.println("Matcher end: " + matcher.end());
//		}

		System.out.println(b);
	}
}