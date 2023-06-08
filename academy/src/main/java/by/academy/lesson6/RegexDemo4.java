package by.academy.lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
		String s = "адреса эл.почты:ivanov99@gmail.com, sidorov@bsu.by!";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(s);

		while (matcher.find()) {
			System.out.println("e-mail: " + matcher.group());
		}
	}
}