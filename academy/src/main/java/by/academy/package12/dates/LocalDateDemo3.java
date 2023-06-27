package by.academy.package12.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class LocalDateDemo3 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2022, 2, 1);

		int year = today.get(ChronoField.YEAR);
		int month = today.get(ChronoField.MONTH_OF_YEAR);
		int dayYear = today.get(ChronoField.DAY_OF_YEAR);
		int dayMonth = today.get(ChronoField.DAY_OF_MONTH);
		int dayWeek = today.get(ChronoField.DAY_OF_WEEK);

		LocalDate dte = today.withYear(2000);
		System.out.println(dte.isLeapYear());
		System.out.println(dte);
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day of the year: " + dayYear);
		System.out.println("Day of the month: " + dayMonth);
		System.out.println("Day of the week: " + dayWeek);
	}
}