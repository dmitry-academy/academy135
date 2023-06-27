package by.academy.package12.dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo2 {
	public static void main(String[] args) {

//		LocalDate today = LocalDate.now();
		LocalDate today = LocalDate.of(2022, 2, 1);

//		System.out.println(Month.FEBRUARY);
		int year = today.getYear();
		int month = today.getMonthValue();
		Month monthAsEnum = today.getMonth(); // как перечисление

		int dayYear = today.getDayOfYear();
		int dayMonth = today.getDayOfMonth();
		DayOfWeek dayWeekEnum = today.getDayOfWeek(); // как перечисление

		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Month name: " + monthAsEnum);
		System.out.println("Day of the year: " + dayYear);
		System.out.println("Day of the month: " + dayMonth);
		System.out.println("Day of the week: " + dayWeekEnum);
		System.out.println("Day of the week (number): " + dayWeekEnum.getValue());

	}
}