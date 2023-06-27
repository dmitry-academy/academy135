package by.academy.package12.dates.instant;

import java.time.Instant;

public class InstantDemo3 {
	public static void main(String[] args) {
		Instant now = Instant.now();
		Instant fiveSecondsAfterEpoch = Instant.ofEpochSecond(5);

		System.out.println("now.isAfter(fiveSecondsAfterEpoch)? " + now.isAfter(fiveSecondsAfterEpoch));
		System.out.println("now.isBefore(fiveSecondsAfterEpoch)? " + now.isBefore(fiveSecondsAfterEpoch));
		System.out.println("now.equals(fiveSecondsAfterEpoch)? " + now.equals(fiveSecondsAfterEpoch));
	}
}