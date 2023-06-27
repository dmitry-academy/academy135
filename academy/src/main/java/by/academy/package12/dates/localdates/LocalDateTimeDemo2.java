package by.academy.package12.dates.localdates;

import java.time.LocalDateTime;

public class LocalDateTimeDemo2 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int year = now.getYear();
        int dayYear = now.getDayOfYear();
        int hour = now.getHour();
        int minute = now.getMinute();

        System.out.println("Год: " + year);
        System.out.println("День в году: " + dayYear);
        System.out.println("Часы: " + hour);
        System.out.println("Минуты: " + minute);
    }
}