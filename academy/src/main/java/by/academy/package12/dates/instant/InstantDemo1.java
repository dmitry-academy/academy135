package by.academy.package12.dates.instant;

import java.time.Instant;
import java.time.temporal.ChronoField;

public class InstantDemo1 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		System.out.println(now);
		Instant instant = now.with(ChronoField.NANO_OF_SECOND, 10);
		// Устанавливаем секунды
		Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);
		// Устанавливаем секунды и наносекунды (могут быть отрицательные)
		Instant sixSecTwoNanBeforeEpoch = Instant.ofEpochSecond(-6, -2);
		// Устанавливаем милисекунды после (могут быть и до) эпохи
		Instant fiftyMilliSecondsAfterEpoch = Instant.ofEpochMilli(50);

		System.out.println("now: " + now.getEpochSecond());
		System.out.println("instant: " + instant);
		System.out.println("Epoch: " + Instant.ofEpochSecond(1687458101));
		System.out.println("fiveSecondsAfterEpoch: " + fiveSecondsAfterEpoch);
		System.out.println("sixSecTwoNanBeforeEpoch: " + sixSecTwoNanBeforeEpoch);
		System.out.println("fiftyMilliSecondsAfterEpoch: " + fiftyMilliSecondsAfterEpoch);
	}
}