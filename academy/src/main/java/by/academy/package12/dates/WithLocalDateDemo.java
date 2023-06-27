package by.academy.package12.dates;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class WithLocalDateDemo {
    public static void main(String[] args) {
        LocalDate newYear2001 = LocalDate.of(2001, 1, 1);

        LocalDate newYear2003 = newYear2001.with(ChronoField.YEAR, 2003);
        LocalDate newYear2004 = newYear2001.withYear(2004);
        LocalDate december2001 = newYear2001.withMonth(12);
        LocalDate february2001 = newYear2001.withDayOfYear(32);
        LocalDate xmas2001 = newYear2001.withMonth(12).withDayOfMonth(25);

        System.out.println("newYear2003 " + newYear2003);
        System.out.println("newYear2004 " + newYear2004);
        System.out.println("december2001 " + december2001);
        System.out.println("february2001 " + february2001);
        System.out.println("xmas2001 " + xmas2001);
        
        System.out.println(newYear2001.isAfter(newYear2003));
        System.out.println(newYear2001.isBefore(newYear2003));
        System.out.println(newYear2001.isEqual(newYear2003));

        
    }
}