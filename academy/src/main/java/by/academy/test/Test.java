package by.academy.test;

import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	private static Stream<Character> getRandomSpecialChars(int count) {
		Random random = new SecureRandom();
		String specialChars = "!@#$%^&*()_+~`|}{[]:;?><,./-=";

		return random.ints(count, 0, specialChars.length()).mapToObj(specialChars::charAt);
	}

	private static Stream<Character> getRandomNumbers(int count) {
		Random random = new Random();

		return random.ints(count, 48, 58).mapToObj(value -> (char) value);
	}

	private static Stream<Character> getRandomAlphabets(int count, boolean includeUpper) {
		Random random = new Random();
		int lowerBound = includeUpper ? 97 : 65; // Determine the lower bound of ASCII codes
		int upperBound = lowerBound + (includeUpper ? 26 * 2 : 26); // Determine the upper bound of ASCII codes

		return random.ints(count, lowerBound, upperBound).mapToObj(value -> (char) value);
	}

	public static String generateSecureRandomPassword() {
		Stream<Character> pwdStream = Stream.concat(getRandomNumbers(2), Stream.concat(getRandomSpecialChars(2),
				Stream.concat(getRandomAlphabets(4, true), getRandomAlphabets(4, false))));
		List<Character> charList = pwdStream.collect(Collectors.toList());
		Collections.shuffle(charList);
		String password = charList.stream().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
		return password;
	}

	public static void main(String... args) {
		System.out.println(generateSecureRandomPassword());
	}
}
