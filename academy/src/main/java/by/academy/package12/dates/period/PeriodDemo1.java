package by.academy.package12.dates.period;

import java.time.Period;

public class PeriodDemo1 {
	public static void main(String[] args) {
		Period period5y4m3d = Period.of(5, 4, 3);
		Period period2d = Period.ofDays(2);
		Period period2m = Period.ofMonths(2);
		Period period14d = Period.ofWeeks(2);
		Period period2y = Period.ofYears(2);
		
		Period period5y2m3dNew = period5y4m3d.withMonths(2);
		
		System.out.println(period5y4m3d);
		System.out.println(period2d);
		System.out.println(period2m);
		System.out.println(period14d);
		System.out.println(period2y);
	}
}