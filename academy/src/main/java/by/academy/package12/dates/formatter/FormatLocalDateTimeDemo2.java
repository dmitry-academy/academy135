package by.academy.package12.dates.formatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatLocalDateTimeDemo2 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.of(2020, 1, 1, 10, 0, 0);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM, dd, yyyy HH:mm:ss", Locale.US);
		System.out.println(dateTime);

		String stringDate = dateTime.format(formatter); // from date to string
		System.out.println(stringDate);

		LocalDateTime t = LocalDateTime.parse(stringDate, formatter); // from string to date
		System.out.println(t);
	}
}